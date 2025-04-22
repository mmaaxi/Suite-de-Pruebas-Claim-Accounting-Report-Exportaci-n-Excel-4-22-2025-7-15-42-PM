package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {
    WebDriver driver;

    By exportButton = By.id("exportButton");
    By downloadLink = By.id("downloadLink");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToClaimAccountingReport() {
        driver.get("url_of_claim_accounting_report");
    }

    public void exportExcelReport() {
        driver.findElement(exportButton).click();
        // Add necessary wait or synchronization here
    }

    public void verifyExportSuccessful() {
        // Implement verification logic here
    }

    public void downloadAndVerifyExcelContent() {
        driver.findElement(downloadLink).click();
        // Add logic to handle file download and initial verification
    }

    public void validateExcelContent() {
        // Implement content validation logic here, possibly involving reading the Excel file
    }
}