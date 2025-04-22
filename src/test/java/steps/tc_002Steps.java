package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_002Page;

public class tc_002Steps {
    tc_002Page reportPage = new tc_002Page();

    @When("I export the Excel from the system")
    public void iExportTheExcelFromTheSystem() {
        reportPage.exportExcel();
    }

    @Then("the Excel file is generated and all columns are visible")
    public void theExcelFileIsGeneratedAndAllColumnsAreVisible() {
        Assert.assertTrue(reportPage.isExcelGenerated());
    }

    @Then("I verify the existence of the following columns: {string}, {string}, {string}, {string}, {string}")
    public void iVerifyTheExistenceOfColumns(String col1, String col2, String col3, String col4, String col5) {
        Assert.assertTrue(reportPage.verifyColumnExists(col1));
        Assert.assertTrue(reportPage.verifyColumnExists(col2));
        Assert.assertTrue(reportPage.verifyColumnExists(col3));
        Assert.assertTrue(reportPage.verifyColumnExists(col4));
        Assert.assertTrue(reportPage.verifyColumnExists(col5));
    }

    @Then("I verify that the column {string} is renamed to {string}")
    public void iVerifyThatTheColumnIsRenamed(String oldName, String newName) {
        Assert.assertTrue(reportPage.verifyColumnRenamed(oldName, newName));
    }
}