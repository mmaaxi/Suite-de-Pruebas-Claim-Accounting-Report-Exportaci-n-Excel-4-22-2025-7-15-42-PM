Feature: Verificar columnas 'Folio de Pago', 'Status Pago Código' y 'Descripción Status Pago' sin valores

  Scenario: Validar que las columnas se exporten vacías en el Excel
    Given El usuario ha exportado el archivo Excel desde la aplicación
    When El usuario revisa la existencia de las columnas 'Folio de Pago', 'Status Pago Código' y 'Descripción Status Pago'
    Then Las columnas 'Folio de Pago', 'Status Pago Código' y 'Descripción Status Pago' están presentes en el Excel
    And Las columnas aparecen vacías pero correctamente ubicadas