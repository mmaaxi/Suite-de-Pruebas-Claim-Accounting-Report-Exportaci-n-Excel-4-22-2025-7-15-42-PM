package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_004Page {

    private WebDriver driver;
    private By movimientoSelector = By.id("movimiento");
    private By exportExcelButton = By.id("exportExcel");
    private By formulaCellLocator = By.xpath("//cell[@id='formula2121']");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void configurarEscenarioMovimiento(String movimiento) {
        driver.findElement(movimientoSelector).sendKeys(movimiento);
        // Set values for the columns: descuento, IVA descuento, ISR, etc.
    }

    public void exportarExcelReporte() {
        driver.findElement(exportExcelButton).click();
        // Additional logic to handle download and verify file
    }

    public boolean verificarFormulaActualizada(String expectedFormula) {
        // Logic to read the Excel and verify the formula content
        String actualFormula = driver.findElement(formulaCellLocator).getText();
        return actualFormula.equals(expectedFormula);
    }
}