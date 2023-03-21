Feature: Usuario agrega productos al carrito

  @Pruebas_tyba
  Scenario Outline: Usuario agrega un producto
    Given Ingreso a la pagina Advantage <usuario> <contraseña>
    When Agrego el producto
    Then Se agrega el producto exitosamente

    Examples:
      |   usuario|contraseña|
      |esneyder95| Fabi1995*|

  @Pruebas_tyba
  Scenario Outline: Usuario agrega varios productos
    Given Ingreso a la pagina Advantage <usuario> <contraseña>
    When Agrego varios productos
    Then Se agregan los productos exitosamente

    Examples:
      |   usuario|contraseña|
      |esneyder95| Fabi1995*|

  @Pruebas_tyba
  Scenario Outline: Usuario agrega mismo producto con distinto color
    Given Ingreso a la pagina Advantage <usuario> <contraseña>
    When Agrego producto distinto color
    Then Se agregan los productos de color exitosamente
    Examples:
      |   usuario|contraseña|
      |esneyder95| Fabi1995*|

  @Pruebas_tyba
  Scenario Outline: Usuario agrega producto con mas de una cantidad
    Given Ingreso a la pagina Advantage <usuario> <contraseña>
    When Agrego producto con mas de una cantidad
    Then Se agrega el producto exitosamente
    Examples:
      |   usuario|contraseña|
      |esneyder95| Fabi1995*|