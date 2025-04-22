package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_009Page;
import static org.junit.Assert.assertTrue;

public class tc_009Steps {
    tc_009Page reportPage = new tc_009Page();

    @Given("el usuario está en la página de reportes")
    public void el_usuario_está_en_la_página_de_reportes() {
        reportPage.navigateToReportPage();
    }

    @When("el usuario exporta el reporte a Excel varias veces en poco tiempo")
    public void el_usuario_exporta_el_reporte_a_Excel_varias_veces_en_poco_tiempo() {
        reportPage.performMultipleExports();
    }

    @Then("el sistema genera cada Excel sin demoras significativas")
    public void el_sistema_genera_cada_Excel_sin_demoras_significativas() {
        assertTrue(reportPage.areExportsTimely());
    }

    @Then("el tiempo de generación cumple con los estándares de rendimiento")
    public void el_tiempo_de_generación_cumple_con_los_estándares_de_rendimiento() {
        assertTrue(reportPage.meetsPerformanceStandards());
    }
}