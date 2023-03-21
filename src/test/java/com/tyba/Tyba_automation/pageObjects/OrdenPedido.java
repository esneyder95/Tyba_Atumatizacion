package com.tyba.Tyba_automation.pageObjects;

import com.tyba.Tyba_automation.utils.InteractorTime;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class OrdenPedido extends PageObject {
    InteractorTime interactorTime = new InteractorTime();
    public By btnnext = By.xpath("//button[@id='next_btn']");
    public By pagosafepay = By.xpath("//input[@name='safepay']");
    public By usersafepay = By.xpath("//input[@name='safepay_username']");
    public By passwordsafepay = By.xpath("//input[@name='safepay_password']");
    public By guardarsafepay = By.xpath("//input[@name='save_safepay']");
    public By btnpagosafepaay = By.xpath("//button[@id='pay_now_btn_SAFEPAY']");
    public By pagomaster = By.xpath("//input[@name='masterCredit']");
    public By numbertarjet = By.xpath("//input[@id='creditCard']");
    public By cvvtarjet = By.xpath("//input[@name='cvv_number']");
    public By cardname = By.xpath("//input[@name='cardholder_name']");
    public By guardarmaster = By.xpath("//input[@name='save_master_credit']");
    public By ordenpago = By.xpath("//label[@id='orderNumberLabel']");
    public By btnpagocredit = By.xpath("//button[@id='pay_now_btn_MasterCredit']");

    public void verificaciondatos(){
        interactorTime.esperaMilis(2000);
        getDriver().findElement(btnnext).click();
        interactorTime.esperaMilis(2000);
    }

    public void metodopago(String pago){
        if (pago.equals("safepay")){
            getDriver().findElement(pagosafepay).click();
            interactorTime.esperaMilis(2000);
            getDriver().findElement(usersafepay).sendKeys("abcde");
            getDriver().findElement(passwordsafepay).sendKeys("Fabi1995*");
            getDriver().findElement(guardarsafepay).click();
            getDriver().findElement(btnpagosafepaay).click();
            interactorTime.esperaMilis(2000);
        }else{
            getDriver().findElement(pagomaster).click();
            interactorTime.esperaMilis(2000);
            getDriver().findElement(btnpagocredit).click();
            interactorTime.esperaMilis(2000);
        }
    }

    public void ordenpago(){
        String orden = getDriver().findElement(ordenpago).getText();
        System.out.println("Su orden de pago es: " + orden);
        interactorTime.esperaMilis(5000);
    }

}
