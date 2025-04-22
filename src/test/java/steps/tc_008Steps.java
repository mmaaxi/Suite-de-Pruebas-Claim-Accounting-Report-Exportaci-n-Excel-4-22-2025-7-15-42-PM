import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_008Page;
import static org.junit.Assert.assertTrue;

public class tc_008Steps {

    tc_008Page page = new tc_008Page();

    @Given("el usuario está en la página de reportes")
    public void elUsuarioEstaEnLaPaginaDeReportes() {
        page.navigateToReportPage();
    }

    @When("el usuario exporta el reporte a Excel")
    public void elUsuarioExportaElReporteAExcel() {
        page.exportReportToExcel();
        assertTrue(page.isExcelDownloaded());
    }

    @Then("el Excel se descarga con todas las columnas")
    public void elExcelSeDescargaConTodasLasColumnas() {
        assertTrue(page.excelContainsAllColumns());
    }

    @Then("las columnas están en el orden correcto y mantienen la integridad de los datos")
    public void lasColumnasEstanEnElOrdenCorrectoYMantienenLaIntegridadDeLosDatos() {
        assertTrue(page.isColumnOrderCorrect());
        assertTrue(page.isDataIntegrityMaintained());
    }
}