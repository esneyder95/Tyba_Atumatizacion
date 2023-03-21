package com.tyba.Tyba_automation.definitions;

import com.tyba.Tyba_automation.steps.OrdenCompraSteps;
import com.tyba.Tyba_automation.steps.ProductosSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;

public class OrdePedidoDefinitions extends PageObject {
    OrdenCompraSteps ordenCompraSteps = new OrdenCompraSteps();
    ProductosSteps productosSteps = new ProductosSteps();

    @When("Agregar productos pago safepay")
    public void agregarproductospgosafepay(){
        productosSteps.agregarproducto("tablet");
        productosSteps.agrgaralcarrito();
        productosSteps.regresaracompras();
        productosSteps.agregarproducto("laptop");
        productosSteps.agrgaralcarrito();
        productosSteps.regresaracompras();
        productosSteps.agregarproducto("parlante");
        productosSteps.agrgaralcarrito();
        productosSteps.escojercolor();
        productosSteps.aumentarcantidad();
        productosSteps.agrgaralcarrito();
        ordenCompraSteps.checkout();
        ordenCompraSteps.verificardatos();
        ordenCompraSteps.metododePago("safepay");
    }

    @Then("Se genera la orden de compra")
    public void ordendepagoexitosa() {
        ordenCompraSteps.ordenpagoexitosa();
    }

    @When("Agregar productos pago mastercredit")
    public void agregarproductospagocredit(){
        productosSteps.agregarproducto("tablet");
        productosSteps.agrgaralcarrito();
        productosSteps.regresaracompras();
        productosSteps.agregarproducto("laptop");
        productosSteps.agrgaralcarrito();
        productosSteps.regresaracompras();
        productosSteps.agregarproducto("parlante");
        productosSteps.agrgaralcarrito();
        productosSteps.escojercolor();
        productosSteps.aumentarcantidad();
        productosSteps.agrgaralcarrito();
        ordenCompraSteps.checkout();
        ordenCompraSteps.verificardatos();
        ordenCompraSteps.metododePago("credit");
    }
}
