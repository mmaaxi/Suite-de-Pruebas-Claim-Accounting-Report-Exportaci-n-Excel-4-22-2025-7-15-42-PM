Feature: Validación end-to-end del flujo de exportación y descarga del Excel

  Scenario: Exportar y descargar el Claim Accounting Report
    Given el usuario está en la sección Claim Accounting Report
    When el usuario inicia la exportación del Excel
    Then el sistema procesa la solicitud de exportación adecuadamente
    When el usuario descarga el archivo y verifica su contenido
    Then el archivo contiene todos los cambios estructurales, de fórmulas y columnas según especificación