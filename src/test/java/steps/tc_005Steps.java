package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_005Page;

public class tc_005Steps {
    tc_005Page page = new tc_005Page();

    @Given("he generado el Excel con datos de IVA (16%, Fronterizo, 0% y Exento) y con IVA retenido")
    public void generarExcelConDatosDeIVA() {
        page.generarExcelConIVA();
    }

    @When("verifico la columna 'IVA Acumulado' que debe sumar solamente IVA 16%, Fronterizo, 0% y Exento, excluyendo el IVA retenido")
    public void verificarCalculoDeIVA() {
        page.verificarCalculoIVA();
    }

    @Then("el reporte cuenta con todos los tipos de IVA cargados")
    public void verificarTiposDeIVACargados() {
        Assert.assertTrue(page.verificarTiposDeIVA());
    }

    @Then("el cálculo se realiza correctamente sin incluir el IVA retenido")
    public void verificarCalculoCorrecto() {
        Assert.assertTrue(page.calculoCorrecto());
    }
}