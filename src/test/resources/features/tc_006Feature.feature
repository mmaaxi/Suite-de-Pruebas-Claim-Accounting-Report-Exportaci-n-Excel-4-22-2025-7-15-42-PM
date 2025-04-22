Feature: Verificar columna 'Folio Pre solicitud' sin valores asignados

  Scenario: Exportar el Excel e identificar columna 'Folio Pre solicitud'
    Given El sistema está preparado para exportar el informe
    When El usuario exporta el Excel desde el sistema
    Then El reporte debe incluir la columna 'Folio Pre solicitud'
    And La columna 'Folio Pre solicitud' está presente aunque no contenga datos