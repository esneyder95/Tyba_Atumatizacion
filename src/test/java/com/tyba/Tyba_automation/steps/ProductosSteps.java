package com.tyba.Tyba_automation.steps;

import com.tyba.Tyba_automation.pageObjects.IconosEncabezado;
import com.tyba.Tyba_automation.pageObjects.InformacionProducto;
import com.tyba.Tyba_automation.pageObjects.ListadoCompras;
import com.tyba.Tyba_automation.pageObjects.PanelDeCompras;
import io.cucumber.java.bs.I;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class ProductosSteps extends PageObject {
    IconosEncabezado iconosEncabezado = new IconosEncabezado();
    PanelDeCompras panelDeCompras = new PanelDeCompras();
    InformacionProducto informacionProducto = new InformacionProducto();
    ListadoCompras listadoCompras = new ListadoCompras();

    @Step
    public void iniciarsesion(String usuario, String contraseña){
        iconosEncabezado.Btniniciarsesion();
        panelDeCompras.iniciarsesion(usuario,contraseña);
    }

    @Step
    public void agregarproducto(String tipo){
        iconosEncabezado.productsitems();
        panelDeCompras.agregarproducto(tipo);
    }

    @Step
    public void agrgaralcarrito(){
        informacionProducto.agregaralcarrito();
    }

    @Step
    public void verificarproductoagredado(String cantidad){
        iconosEncabezado.carrito();
        listadoCompras.verificarproductoscarrito(cantidad);
    }

    @Step
    public void regresaracompras(){
        informacionProducto.regresaracompras();
    }

    @Step
    public void escojercolor(){
        informacionProducto.escjercolor();
    }

    @Step
    public void aumentarcantidad(){
        informacionProducto.aumentarcantidad();
    }

    @Step
    public void vericareliminardata(){
        iconosEncabezado.carrito();
        listadoCompras.verficaroeliminarlistadocarrito();
    }

}
