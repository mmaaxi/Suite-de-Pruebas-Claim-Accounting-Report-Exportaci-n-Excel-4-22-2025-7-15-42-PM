Feature: Validación del cálculo de IVA Acumulado

  Scenario: Validar cálculo de 'IVA Acumulado'
    Given he generado el Excel con datos de IVA (16%, Fronterizo, 0% y Exento) y con IVA retenido
    When verifico la columna 'IVA Acumulado' que debe sumar solamente IVA 16%, Fronterizo, 0% y Exento, excluyendo el IVA retenido
    Then el reporte cuenta con todos los tipos de IVA cargados
    And el cálculo se realiza correctamente sin incluir el IVA retenido