package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.tc_010Page;

public class tc_010Steps {
    WebDriver driver;
    tc_010Page claimAccountingPage;

    @Given("el usuario está en la sección Claim Accounting Report")
    public void el_usuario_esta_en_la_seccion_claim_accounting_report() {
        claimAccountingPage = new tc_010Page(driver);
        claimAccountingPage.navigateToClaimAccountingReport();
    }

    @When("el usuario inicia la exportación del Excel")
    public void el_usuario_inicia_la_exportacion_del_Excel() {
        claimAccountingPage.exportExcelReport();
    }

    @Then("el sistema procesa la solicitud de exportación adecuadamente")
    public void el_sistema_procesa_la_solicitud_de_exportacion_adecuadamente() {
        claimAccountingPage.verifyExportSuccessful();
    }

    @When("el usuario descarga el archivo y verifica su contenido")
    public void el_usuario_descarga_el_archivo_y_verifica_su_contenido() {
        claimAccountingPage.downloadAndVerifyExcelContent();
    }

    @Then("el archivo contiene todos los cambios estructurales, de fórmulas y columnas según especificación")
    public void el_archivo_contiene_todos_los_cambios_estructurales_de_formulas_y_columnas_según_especificación() {
        claimAccountingPage.validateExcelContent();
    }
}