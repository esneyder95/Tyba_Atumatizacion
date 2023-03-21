package com.tyba.Tyba_automation.steps;

import com.tyba.Tyba_automation.pageObjects.FormularioRegistro;
import com.tyba.Tyba_automation.pageObjects.IconosEncabezado;
import com.tyba.Tyba_automation.pageObjects.PanelDeCompras;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class RegistroSteps extends PageObject {

    PanelDeCompras panelDeCompras = new PanelDeCompras();
    IconosEncabezado iconosEncabezado = new IconosEncabezado();
    FormularioRegistro formularioRegistro = new FormularioRegistro();

    @Step
    public void ingresopaginaAdvantage(){
        panelDeCompras.OpenAdavantage();
    }

    @Step
    public void abrirmoduloregistro(){
        iconosEncabezado.Btniniciarsesion();
        iconosEncabezado.crearnuevacuenta();
    }

    @Step
    public void llenarformulario(){
        formularioRegistro.crearCuneta();
    }

    @Step
    public void registroexitoso(){
        iconosEncabezado.registroexitoso();
    }

    @Step
    public void camposobligatorios(){
        formularioRegistro.verificarcamposobligatorios();
    }

    @Step
    public void btnregitrarhabilitado(){
        formularioRegistro.btnregistrarhabiltado();
    }

    @Step
    public void verificarusuario(String usuario){
        formularioRegistro.verificarusuario(usuario);
    }

    @Step
    public void msginvalido(){
        formularioRegistro.msginvalido();
    }
}
