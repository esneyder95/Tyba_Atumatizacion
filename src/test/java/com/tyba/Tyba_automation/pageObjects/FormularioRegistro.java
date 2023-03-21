package com.tyba.Tyba_automation.pageObjects;

import com.tyba.Tyba_automation.utils.DataRandom;
import com.tyba.Tyba_automation.utils.InteractorTime;
import net.serenitybdd.core.pages.PageObject;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class FormularioRegistro extends PageObject {

    InteractorTime interactorTime = new InteractorTime();
    public By usuario = By.xpath("//input[@name='usernameRegisterPage']");
    public By email = By.xpath("//input[@name='emailRegisterPage']");
    public By contraseña = By.xpath("//input[@name='passwordRegisterPage']");
    public By confirmarcontraseña= By.xpath("//input[@name='confirm_passwordRegisterPage']");
    public By nombre = By.xpath("//input[@name='first_nameRegisterPage']");
    public By apellido = By.xpath("//input[@name='last_nameRegisterPage']");
    public By telefono = By.xpath("//input[@name='phone_numberRegisterPage']");
    public By pais = By.xpath("//select[@name='countryListboxRegisterPage']");
    public By ciudad = By.xpath("//input[@name='cityRegisterPage']");
    public By direccion = By.xpath("//input[@name='addressRegisterPage']");
    public By provivencia = By.xpath("//input[@name='state_/_province_/_regionRegisterPage']");
    public By postalcode = By.xpath("//input[@name='postal_codeRegisterPage']");
    public By condiciones = By.xpath("//input[@name='i_agree']");
    public By Btnregistrar = By.xpath("//button[@id='register_btnundefined']");
    public By msginavlido = By.xpath("//label[@class='invalid center block smollMargin']");
    public static String usr;

    public void crearCuneta(){
        usr = DataRandom.Usuario();
        getDriver().findElement(usuario).sendKeys(usr);
        getDriver().findElement(email).sendKeys(DataRandom.CorreoElectronico());
        getDriver().findElement(contraseña).sendKeys("Fabi1995*");
        getDriver().findElement(confirmarcontraseña).sendKeys("Fabi1995*");
        getDriver().findElement(nombre).sendKeys(DataRandom.Nombre());
        getDriver().findElement(apellido).sendKeys(DataRandom.Apellido());
        getDriver().findElement(telefono).sendKeys(DataRandom.NumeroCelular());
        getDriver().findElement(pais).sendKeys(Keys.ENTER);
        for (int i=0; i<=43; i++){
            getDriver().findElement(pais).sendKeys(Keys.ARROW_DOWN);
        }
        getDriver().findElement(pais).sendKeys(Keys.ENTER);
        getDriver().findElement(ciudad).sendKeys("BOGOTA");
        getDriver().findElement(direccion).sendKeys("Calle 68 A sur N 48 20");
        getDriver().findElement(provivencia).sendKeys("Bogota");
        getDriver().findElement(postalcode).sendKeys("121314");
        getDriver().findElement(condiciones).click();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,100)");
        getDriver().findElement(Btnregistrar).click();
        interactorTime.esperaMilis(5000);
    }
    public void verificarcamposobligatorios(){
        getDriver().findElement(usuario).sendKeys(DataRandom.Usuario());
        getDriver().findElement(email).sendKeys(DataRandom.CorreoElectronico());
        getDriver().findElement(contraseña).sendKeys("Fabi1995*");
        getDriver().findElement(confirmarcontraseña).sendKeys("Fabi1995*");
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,500)");
        getDriver().findElement(condiciones).click();
        js.executeScript("window.scrollBy(0,100)");
        interactorTime.esperaMilis(5000);
    }

    public void verificarusuario(String vusuario){
        if (vusuario.contains("@") == true){
            getDriver().findElement(usuario).sendKeys(DataRandom.Usuario());
            getDriver().findElement(email).sendKeys(vusuario);
            getDriver().findElement(contraseña).sendKeys("Fabi1995*");
            getDriver().findElement(confirmarcontraseña).sendKeys("Fabi1995*");
            JavascriptExecutor js = (JavascriptExecutor) getDriver();
            js.executeScript("window.scrollBy(0,500)");
            getDriver().findElement(condiciones).click();
            js.executeScript("window.scrollBy(0,100)");
            getDriver().findElement(Btnregistrar).click();
            interactorTime.esperaMilis(5000);
        }else{
            getDriver().findElement(usuario).sendKeys(vusuario);
            getDriver().findElement(email).sendKeys(DataRandom.CorreoElectronico());
            getDriver().findElement(contraseña).sendKeys("Fabi1995*");
            getDriver().findElement(confirmarcontraseña).sendKeys("Fabi1995*");
            JavascriptExecutor js = (JavascriptExecutor) getDriver();
            js.executeScript("window.scrollBy(0,500)");
            getDriver().findElement(condiciones).click();
            js.executeScript("window.scrollBy(0,100)");
            getDriver().findElement(Btnregistrar).click();
            interactorTime.esperaMilis(2000);
        }
    }

    public void msginvalido(){
        try {
            if (getDriver().findElement(msginavlido).getText().equals("User name already exists")){
                System.out.println("Esta validando el campo");
            }else{
                try {
                    int i;
                    i = 1/0;
                }catch (Exception e){
                    throw new RuntimeException("No esta validando el campo");
                }
            }
        }catch (Exception e){
            throw new RuntimeException("No esta validando el campo");
        }
    }
    public void btnregistrarhabiltado(){
        if (getDriver().findElement(Btnregistrar).isEnabled()){
            System.out.println("Boton registrar habilitado");
        }else{
            try {
                int i;
                i = 1/0;
            }catch (Exception e){
                throw new RuntimeException("Boton registrar deshabilitado");
            }
        }
    }
    public static String usario (){
        return usr;
    }

}
