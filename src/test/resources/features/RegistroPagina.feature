Feature:Validaciones registro de usuario

  @Pruebas_tyba
  Scenario: Registro de un nuevo usuario
    Given Ingreso al modulo de registro
    When LLeno informacion de formulario
    Then Registro exitoso


  @Pruebas_tyba
  Scenario: Validar campos obligatorios registro
    Given Ingreso al modulo de registro
    When  Ingreso campos obligatorios
    Then  Boton registrar hablitado

  @Pruebas_tyba
  Scenario Outline: Validar usuario existente
    Given Ingreso al modulo de registro
    When Ingreso campos obligatorios <usuario>
    Then Muestra msg invalido

    Examples:
      |   usuario|
      |esneyder95|

  @Pruebas_tyba
  Scenario Outline: Validar correo existente
    Given Ingreso al modulo de registro
    When Ingreso campos obligatorios <correo>
    Then Muestra msg invalido

    Examples:
      |                   correo|
      |esneider-2895@hotmail.com|