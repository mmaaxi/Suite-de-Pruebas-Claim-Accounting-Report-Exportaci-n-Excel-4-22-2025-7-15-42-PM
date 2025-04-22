Feature: Validate new and renamed columns in Excel

  Scenario: Verify column existence and renaming
    Given the Claim Accounting Report system is running
    When I export the Excel from the system
    Then the Excel file is generated and all columns are visible
    And I verify the existence of the following columns: "Estado Código", "Monto acumulado Folio Reserva 5401", "Folio Pre solicitud", "Folio de Pago", "Status Pago Código"
    And I verify that the column "Monto Acumulado Folio OPC" is renamed to "Monto Acumulado Folio OPC (2121)"
    And I verify that the column "Status de Pago" is renamed to "Descripción Status Pago"