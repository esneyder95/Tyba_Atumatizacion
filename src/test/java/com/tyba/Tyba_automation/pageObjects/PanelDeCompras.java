package com.tyba.Tyba_automation.pageObjects;

import com.tyba.Tyba_automation.utils.InteractorTime;
import io.cucumber.java.bs.I;
import jnr.ffi.annotations.In;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.openqa.selenium.By;

public class PanelDeCompras extends PageObject {
    InteractorTime interactorTime = new InteractorTime();
    public By usuario = By.xpath("//input[@name='username']");
    public By contraseña = By.xpath("//input[@name='password']");
    public By btningresar = By.id("sign_in_btnundefined");
    public By productotablet = By.xpath("//label[@id='details_16']");
    public By productolaptop = By.xpath("//label[@id='details_10']");
    public By productoparalante = By.xpath("//label[@id='details_21']");
    public static String Url;
    public void OpenAdavantage() {
        try {
            EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
            Url = variables.getProperty("webdriver.Url");
            getDriver().get(Url);
        }catch (Exception e){
            throw new RuntimeException("La pagina web no carga");
        }
        interactorTime.esperaMilis(5000);
    }

    public void iniciarsesion(String vusuario, String vcontraseña){
        interactorTime.esperaMilis(2000);
        getDriver().findElement(usuario).sendKeys(vusuario);
        getDriver().findElement(contraseña).sendKeys(vcontraseña);
        interactorTime.esperaMilis(1000);
        getDriver().findElement(btningresar).click();
        interactorTime.esperaMilis(2000);
    }

    public void agregarproducto(String tipo){
        switch (tipo){
            case "tablet" : {
                getDriver().findElement(productotablet).click();
                break;
            }
            case  "laptop" : {
                getDriver().findElement(productolaptop).click();
                break;
            }
            case "parlante" : {
                getDriver().findElement(productoparalante).click();
                break;
            }
        }
        interactorTime.esperaMilis(5000);
    }

}
