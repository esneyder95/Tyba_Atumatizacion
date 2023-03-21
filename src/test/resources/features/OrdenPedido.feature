Feature: Usuario genera orden de pago y pedido

  @Pruebas_tyba
  Scenario Outline: Usuario genera pedido con pago safepay
    Given Ingreso a la pagina Advantage <usuario> <contraseña>
    When Agregar productos pago safepay
    Then Se genera la orden de compra
    Examples:
      |   usuario|contraseña|
      |esneyder95| Fabi1995*|

  @Pruebas_tyba
  Scenario Outline: Usuario genera pedio con pago mastercredit
    Given Ingreso a la pagina Advantage <usuario> <contraseña>
    When Agregar productos pago mastercredit
    Then Se genera la orden de compra
    Examples:
      |   usuario|contraseña|
      |esneyder95| Fabi1995*|