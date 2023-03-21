package com.tyba.Tyba_automation.steps;

import com.tyba.Tyba_automation.pageObjects.IconosEncabezado;
import com.tyba.Tyba_automation.pageObjects.ListadoCompras;
import com.tyba.Tyba_automation.pageObjects.OrdenPedido;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class OrdenCompraSteps extends PageObject {
    ListadoCompras listadoCompras = new ListadoCompras();
    IconosEncabezado iconosEncabezado = new IconosEncabezado();
    OrdenPedido ordenPago= new OrdenPedido();
    @Step
    public void checkout(){
        iconosEncabezado.carrito();
        listadoCompras.checkoutpedido();
    }

    @Step
    public void verificardatos(){
        ordenPago.verificaciondatos();
    }

    @Step
    public void metododePago(String pago){
        ordenPago.metodopago(pago);
    }

    @Step
    public void ordenpagoexitosa(){
        ordenPago.ordenpago();
    }
}
