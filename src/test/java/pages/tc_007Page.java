package pages;

import org.openqa.selenium.WebDriver;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class tc_007Page {
    WebDriver driver;
    File excelFile = new File("/path/to/exported/excel.xlsx");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void exportExcel() {
        // Logic to interact with the application to export the Excel
    }

    public boolean checkColumnsExist() {
        try (FileInputStream fis = new FileInputStream(excelFile);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);
            Row headerRow = sheet.getRow(0);
            return headerRow.getCell(0).getStringCellValue().equals("Folio de Pago") &&
                   headerRow.getCell(1).getStringCellValue().equals("Status Pago Código") &&
                   headerRow.getCell(2).getStringCellValue().equals("Descripción Status Pago");
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean verifyColumnsArePresent() {
        // Reuse checkColumnsExist logic
        return checkColumnsExist();
    }

    public boolean verifyColumnsAreEmpty() {
        try (FileInputStream fis = new FileInputStream(excelFile);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                if (row.getRowNum() == 0) continue; // Skip header row
                if (row.getCell(0) != null && !row.getCell(0).getStringCellValue().isEmpty()) return false;
                if (row.getCell(1) != null && !row.getCell(1).getStringCellValue().isEmpty()) return false;
                if (row.getCell(2) != null && !row.getCell(2).getStringCellValue().isEmpty()) return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}