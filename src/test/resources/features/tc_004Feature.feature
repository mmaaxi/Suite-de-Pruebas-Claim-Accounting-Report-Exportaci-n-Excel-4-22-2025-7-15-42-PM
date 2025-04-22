Feature: Validar actualización de fórmula "Monto Acumulado Folio OPC (2121)"

  Scenario: Validar la fórmula en el Excel exportado para el reporte de pagos
    Given que configuro un escenario de movimiento "pago" con valores en las columnas de descuento, IVA descuento, ISR, Impuesto cedular, IVA acumulable y IVA retenido
    When exporto el Excel del reporte
    Then verifico que la fórmula de "Monto Acumulado Folio OPC (2121)" sume el valor actual más los montos de IVA y descuentos correctamente