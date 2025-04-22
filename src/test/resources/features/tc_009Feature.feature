Feature: Validar rendimiento en la generación del Excel

  Scenario: Exportar reportes múltiples y validar rendimiento
    Given el usuario está en la página de reportes
    When el usuario exporta el reporte a Excel varias veces en poco tiempo
    Then el sistema genera cada Excel sin demoras significativas
    And el tiempo de generación cumple con los estándares de rendimiento