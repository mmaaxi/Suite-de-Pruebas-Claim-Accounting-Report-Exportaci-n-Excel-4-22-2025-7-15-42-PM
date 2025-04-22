package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_007Page;

public class tc_007Steps {
    WebDriver driver;
    tc_007Page page;

    public tc_007Steps() {
        this.driver = Hooks.driver;
        page = new tc_007Page(driver);
    }

    @Given("El usuario ha exportado el archivo Excel desde la aplicación")
    public void el_usuario_ha_exportado_el_archivo_excel_desde_la_aplicación() {
        // Code to export the Excel file
        page.exportExcel();
    }

    @When("El usuario revisa la existencia de las columnas 'Folio de Pago', 'Status Pago Código' y 'Descripción Status Pago'")
    public void el_usuario_revisa_la_existencia_de_las_columnas() {
        // Code to check the presence of columns in the Excel
        Assert.assertTrue(page.checkColumnsExist());
    }

    @Then("Las columnas 'Folio de Pago', 'Status Pago Código' y 'Descripción Status Pago' están presentes en el Excel")
    public void las_columnas_están_presentes_en_el_excel() {
        // Verifying the columns are present
        Assert.assertTrue(page.verifyColumnsArePresent());
    }

    @Then("Las columnas aparecen vacías pero correctamente ubicadas")
    public void las_columnas_aparecen_vacías_pero_correctamente_ubicadas() {
        // Confirm columns are empty
        Assert.assertTrue(page.verifyColumnsAreEmpty());
    }
}