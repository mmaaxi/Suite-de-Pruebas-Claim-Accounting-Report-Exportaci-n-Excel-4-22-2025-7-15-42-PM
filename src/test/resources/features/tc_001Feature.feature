Feature: Validate Unique Key Generation in Excel

  Scenario: Validate the generation of a unique key in the exported Excel report
    Given I have exported the Claim Accounting Report
    When I open the exported Excel file
    Then I should see a unique key in column C that is a concatenation of No. Siniestro, No. de Autorización, Status, Tipo de Movimiento, and No. de Movimiento separated by '_'