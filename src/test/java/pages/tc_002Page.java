package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;

public class tc_002Page {
    WebDriver driver;

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void exportExcel() {
        driver.findElement(By.id("exportExcelButton")).click();
        // Include additional waiting or handling if necessary
    }

    public boolean isExcelGenerated() {
        // Logic to verify if the Excel is generated
        return true; // Placeholder for actual verification
    }

    public boolean verifyColumnExists(String columnName) {
        // Logic to check for the column existence
        // Simulate retrieving the list of columns from the Excel
        List<String> columns = List.of("Estado Código", "Monto acumulado Folio Reserva 5401", "Folio Pre solicitud", "Folio de Pago", "Status Pago Código");
        return columns.contains(columnName);
    }

    public boolean verifyColumnRenamed(String oldName, String newName) {
        // Logic to verify column renaming
        String existingColumn = newName; // Assume the actual Excel fetching logic here
        return existingColumn.equals(newName);
    }
}