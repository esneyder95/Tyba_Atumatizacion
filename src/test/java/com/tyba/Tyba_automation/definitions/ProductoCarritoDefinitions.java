package com.tyba.Tyba_automation.definitions;

import com.tyba.Tyba_automation.steps.ProductosSteps;
import com.tyba.Tyba_automation.steps.RegistroSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import org.omg.CORBA.PUBLIC_MEMBER;

public class ProductoCarritoDefinitions extends PageObject {
    RegistroSteps registroSteps = new RegistroSteps();
    ProductosSteps productosSteps = new ProductosSteps();
    @Given("Ingreso a la pagina Advantage {} {}")
    public void ingresopagina(String usuario,String contraseña){
        registroSteps.ingresopaginaAdvantage();
        productosSteps.iniciarsesion(usuario,contraseña);
    }

    @When("Agrego el producto")
    public void agregoproductos(){
        productosSteps.vericareliminardata();
        productosSteps.regresaracompras();
        productosSteps.agregarproducto("tablet");
        productosSteps.agrgaralcarrito();
    }

    @Then("Se agrega el producto exitosamente")
    public void agregapriductoexitoso(){
        productosSteps.verificarproductoagredado("uno");
    }

    @When("Agrego varios productos")
    public void agregarvariosproductos(){
        productosSteps.vericareliminardata();
        productosSteps.regresaracompras();
        productosSteps.agregarproducto("tablet");
        productosSteps.agrgaralcarrito();
        productosSteps.regresaracompras();
        productosSteps.agregarproducto("laptop");
        productosSteps.agrgaralcarrito();
        productosSteps.regresaracompras();
        productosSteps.agregarproducto("parlante");
        productosSteps.agrgaralcarrito();
    }

    @Then("Se agregan los productos exitosamente")
    public void prudctosvariosexitoso(){
        productosSteps.verificarproductoagredado("tres");
    }

    @When("Agrego producto distinto color")
    public void agregarvariosproductoscolor(){
        productosSteps.vericareliminardata();
        productosSteps.regresaracompras();
        productosSteps.agregarproducto("parlante");
        productosSteps.agrgaralcarrito();
        productosSteps.escojercolor();
        productosSteps.agrgaralcarrito();
    }

    @Then("Se agregan los productos de color exitosamente")
    public void prudctosvariosexitosocolor(){
        productosSteps.verificarproductoagredado("dos");
    }

    @When("Agrego producto con mas de una cantidad")
    public void agregarvariosproductocantidad(){
        productosSteps.vericareliminardata();
        productosSteps.regresaracompras();
        productosSteps.agregarproducto("parlante");
        productosSteps.aumentarcantidad();
        productosSteps.agrgaralcarrito();
    }
}
