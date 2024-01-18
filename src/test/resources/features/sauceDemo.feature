Feature: registro de una compra

  @WEB_SAUCEDEMO_COMPRA
  Scenario Outline: Registrar una compra de dos productos en la web Swag Labs

    Given que Ingreso la pagina Saucedemo
    And Ingresamos los credenciales de acceso <username>, <password>
    When nos muestra la siguiente página agregamos dos productos al carrito
    And visualizamos el carrito con dos productos
    And Registramos datos personales <First Name>,<Last Name> y <Postal Code>
    When hacemos clic en botón Continuar
    Then validamos la confirmación de la compra

  Examples:
  |username|password|First Name|Last Name|Postal Code|
  |standard_user|secret_sauce|carmen|Yupanqui|1203|