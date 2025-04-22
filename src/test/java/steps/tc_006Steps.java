package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_006Page;

public class tc_006Steps {

    private tc_006Page page;

    public tc_006Steps() {
        page = new tc_006Page();
    }

    @Given("El sistema está preparado para exportar el informe")
    public void setupExportSystem() {
        page.prepararSistemaExportacion();
    }

    @When("El usuario exporta el Excel desde el sistema")
    public void exportExcelReport() {
        page.exportarExcel();
    }

    @Then("El reporte debe incluir la columna 'Folio Pre solicitud'")
    public void verifyFolioPreSolicitudColumnExists() {
        page.verificarColumnaFolioPreSolicitud();
    }

    @Then("La columna 'Folio Pre solicitud' está presente aunque no contenga datos")
    public void verifyFolioPreSolicitudColumnIntegrity() {
        page.verificarIntegridadColumnaFolioPreSolicitud();
    }
}