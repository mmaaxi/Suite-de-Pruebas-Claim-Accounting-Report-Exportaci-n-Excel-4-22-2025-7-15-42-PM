package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_009Page {
    private WebDriver driver;
    private By exportButton = By.id("exportButton");
    private long[] exportTimes;
    private static final long PERFORMANCE_STANDARD_THRESHOLD = 5000; // tiempo en milisegundos

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToReportPage() {
        driver.get("https://example.com/report");
    }

    public void performMultipleExports() {
        exportTimes = new long[5];
        for (int i = 0; i < 5; i++) {
            long startTime = System.currentTimeMillis();
            driver.findElement(exportButton).click();
            waitForExportToComplete();
            exportTimes[i] = System.currentTimeMillis() - startTime;
        }
    }

    public boolean areExportsTimely() {
        for (long time : exportTimes) {
            if (time > PERFORMANCE_STANDARD_THRESHOLD) {
                return false;
            }
        }
        return true;
    }

    public boolean meetsPerformanceStandards() {
        long averageTime = 0;
        for (long time : exportTimes) {
            averageTime += time;
        }
        averageTime /= exportTimes.length;
        return averageTime <= PERFORMANCE_STANDARD_THRESHOLD;
    }

    private void waitForExportToComplete() {
        // Aquí se puede implementar una lógica que espera hasta que el sistema confirme
        // que el reporte está listo, por ejemplo, esperando que un elemento nuevo en la página sea visible
    }
}