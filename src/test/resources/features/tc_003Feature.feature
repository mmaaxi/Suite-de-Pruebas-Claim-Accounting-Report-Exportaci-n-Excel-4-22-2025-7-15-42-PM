Feature: Validar cálculo de 'Monto acumulado Folio Reserva 5401'.

  Scenario: Validar cálculo del monto acumulado para la reserva
    Given el sistema está preparado para exportar el reporte de reserva
    When el usuario exporta el reporte con datos de reserva consecutivos
    Then un Excel es generado con datos de Monto (reserva) en filas consecutivas
    When el usuario compara el valor de 'Monto acumulado Folio Reserva 5401' 
    with la suma de la reserva acumulada previa y la reserva actual
    Then el valor se corresponde con la suma esperada