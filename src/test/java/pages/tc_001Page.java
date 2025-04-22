package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class tc_001Page {

    private WebDriver driver;
    private static final String EXCEL_FILE_PATH = "path/to/exported/excel.xlsx";

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void exportReport() {
        // Implementation to click on the export button for the Claim Accounting Report
        WebElement exportButton = driver.findElement(By.id("exportReportButton"));
        exportButton.click();
    }

    public void openExcelFile() {
        // Implementation to open the Excel file
        // Assume that this function handles the parsing automatically
    }

    public void verifyUniqueKeyInExcel() {
        try (XSSFWorkbook workbook = new XSSFWorkbook(EXCEL_FILE_PATH)) {
            XSSFSheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                if (row.getRowNum() == 0) { // Skip header row
                    continue;
                }
                String uniqueKey = row.getCell(2).getStringCellValue();
                String expectedKey = row.getCell(0).getStringCellValue() + "_" + 
                                     row.getCell(1).getStringCellValue() + "_" + 
                                     row.getCell(3).getStringCellValue() + "_" + 
                                     row.getCell(4).getStringCellValue() + "_" + 
                                     row.getCell(5).getStringCellValue();
                assert uniqueKey.equals(expectedKey) : "Unique Key does not match!";
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("An error occurred while verifying the unique key in Excel");
        }
    }
}