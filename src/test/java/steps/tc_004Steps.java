package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_004Page;

public class tc_004Steps {

    tc_004Page page = new tc_004Page();

    @Given("que configuro un escenario de movimiento {string} con valores en las columnas de descuento, IVA descuento, ISR, Impuesto cedular, IVA acumulable y IVA retenido")
    public void configuroEscenarioMovimientoPago(String movimiento) {
        page.configurarEscenarioMovimiento(movimiento);
    }

    @When("exporto el Excel del reporte")
    public void exportoExcelReporte() {
        page.exportarExcelReporte();
    }

    @Then("verifico que la fórmula de {string} sume el valor actual más los montos de IVA y descuentos correctamente")
    public void verificoFormulaActualizada(String formula) {
        Assert.assertTrue(page.verificarFormulaActualizada(formula));
    }
}