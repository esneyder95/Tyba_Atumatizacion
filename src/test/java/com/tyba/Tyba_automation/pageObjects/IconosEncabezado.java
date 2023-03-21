package com.tyba.Tyba_automation.pageObjects;

import com.tyba.Tyba_automation.utils.InteractorTime;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IconosEncabezado extends PageObject {

    InteractorTime interactorTime = new InteractorTime();
    public By BtnInciarsesion = By.xpath("//*[name()='svg' and @id='menuUser']");
    public By Btncarrito = By.xpath("//a[@id='shoppingCartLink']//*[name()='svg']");
    public By Crearcuenta = By.xpath("//a[@class='create-new-account ng-scope']");
    public By usuario = By.xpath("//span[@class='hi-user containMiniTitle ng-binding']");
    public By popularitems = By.xpath("//ul[@class='roboto-light desktop-handler']/li[6]/a");
    public void Btniniciarsesion(){
        interactorTime.esperaMilis(5000);
        getDriver().findElement(BtnInciarsesion).click();
        interactorTime.esperaMilis(5000);
    }

    public void crearnuevacuenta(){
        getDriver().findElement(Crearcuenta).click();
        interactorTime.esperaMilis(5000);
    }

    public void registroexitoso(){
        if (FormularioRegistro.usario().equals(getDriver().findElement(usuario).getText())){
            System.out.println("Registro exitoso");
        }else{
            try {
                int i;
                i = 1/0;
            }catch (Exception e){
                throw new RuntimeException("Resgistro no exitoso");
            }
        }
    }

    public void productsitems(){
        getDriver().findElement(popularitems).click();
        interactorTime.esperaMilis(2000);
    }

    public void carrito(){
        interactorTime.esperaMilis(2000);
        getDriver().findElement(Btncarrito).click();
        interactorTime.esperaMilis(2000);
    }

}
