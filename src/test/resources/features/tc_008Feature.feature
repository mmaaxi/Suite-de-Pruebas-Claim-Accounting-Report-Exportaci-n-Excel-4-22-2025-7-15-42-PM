Feature: Validar integridad y posición de las columnas exportadas

  Scenario: Exportar y verificar el Excel generado en el reporte
    Given el usuario está en la página de reportes
    When el usuario exporta el reporte a Excel
    Then el Excel se descarga con todas las columnas
    And las columnas están en el orden correcto y mantienen la integridad de los datos