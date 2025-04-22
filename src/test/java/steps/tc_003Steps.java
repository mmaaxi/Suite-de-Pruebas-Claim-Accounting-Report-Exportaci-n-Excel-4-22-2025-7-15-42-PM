package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_003Page;

public class tc_003Steps {
    tc_003Page tc_003Page = new tc_003Page();

    @Given("el sistema está preparado para exportar el reporte de reserva")
    public void sistema_preparado_exportar_reporte() {
        // Logic to ensure system is ready for exporting report
        tc_003Page.prepareSystemForReport();
    }

    @When("el usuario exporta el reporte con datos de reserva consecutivos")
    public void exporta_reporte_datos_reserva_consecutivos() {
        // Logic to export report with consecutive reservation data
        tc_003Page.exportReport();
    }

    @Then("un Excel es generado con datos de Monto (reserva) en filas consecutivas")
    public void excel_generado_con_datos_monto_reserva() {
        // Validate exported Excel has necessary data
        Assert.assertTrue(tc_003Page.isExcelGeneratedWithCorrectData());
    }

    @When("el usuario compara el valor de 'Monto acumulado Folio Reserva 5401' with la suma de la reserva acumulada previa y la reserva actual")
    public void compara_valor_monto_acumulado() {
        // Logic to compare accumulated amount
        tc_003Page.compareAccumulatedAmount();
    }
    
    @Then("el valor se corresponde con la suma esperada")
    public void valor_coincide_con_suma_esperada() {
        // Validate the calculated amount matches the expected
        Assert.assertTrue(tc_003Page.isAccumulatedAmountCorrect());
    }
}