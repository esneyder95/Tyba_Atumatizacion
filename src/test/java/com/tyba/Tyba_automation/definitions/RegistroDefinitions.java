package com.tyba.Tyba_automation.definitions;
import com.tyba.Tyba_automation.steps.RegistroSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;

public class RegistroDefinitions extends PageObject {
    RegistroSteps registroSteps = new RegistroSteps();
    @Given("Ingreso al modulo de registro")
    public void ingresoPaginaAdvantage(){
        registroSteps.ingresopaginaAdvantage();
        registroSteps.abrirmoduloregistro();
    }

    @When("LLeno informacion de formulario")
    public void ingresoModuloRegistro(){
        registroSteps.llenarformulario();
    }

    @Then("Registro exitoso")
    public void cargueModuloRegistro(){
        registroSteps.registroexitoso();
    }

    @When("Ingreso campos obligatorios")
    public void ingresocamposobligatorios(){
        registroSteps.camposobligatorios();
    }

    @Then("Boton registrar hablitado")
    public void botonregistrar(){
        registroSteps.btnregitrarhabilitado();
    }

    @When("Ingreso campos obligatorios {}")
    public void ingresocamposobligatorios(String usuario){
        registroSteps.verificarusuario(usuario);
    }

    @Then("Muestra msg invalido")
    public void mesgInvalido(){
        registroSteps.msginvalido();
    }

}
