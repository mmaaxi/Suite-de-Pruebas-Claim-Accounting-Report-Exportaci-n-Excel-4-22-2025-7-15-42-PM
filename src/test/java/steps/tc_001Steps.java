package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_001Page;

public class tc_001Steps {

    private tc_001Page page = new tc_001Page();

    @Given("I have exported the Claim Accounting Report")
    public void exportClaimAccountingReport() {
        page.exportReport();
    }

    @When("I open the exported Excel file")
    public void openExportedExcelFile() {
        page.openExcelFile();
    }

    @Then("I should see a unique key in column C that is a concatenation of No. Siniestro, No. de Autorización, Status, Tipo de Movimiento, and No. de Movimiento separated by '_'")
    public void verifyUniqueKeyInExcel() {
        page.verifyUniqueKeyInExcel();
    }
}