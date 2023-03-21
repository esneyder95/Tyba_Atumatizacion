package com.tyba.Tyba_automation.pageObjects;

import com.tyba.Tyba_automation.utils.InteractorTime;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class InformacionProducto extends PageObject {
    InteractorTime interactorTime = new InteractorTime();
    public By btnagregarcarrito = By.xpath("//button[@name='save_to_cart']");
    public By home = By.xpath("//a[@translate='HOME']");
    public By colornegro = By.xpath("//div[@ng-show='firstImageToShow']/span[2]");
    public By btnaumentar = By.xpath("//div[@class='plus']");
    public By btncheckoutpopup = By.xpath("//button[@id='checkOutPopUp']");

    public void agregaralcarrito(){
        getDriver().findElement(btnagregarcarrito).click();
        interactorTime.esperaMilis(2000);
    }

    public void regresaracompras(){
        getDriver().findElement(home).click();
        interactorTime.esperaMilis(2000);
    }

    public void escjercolor(){
        getDriver().findElement(colornegro).click();
        interactorTime.esperaMilis(2000);
    }

    public void aumentarcantidad(){
        getDriver().findElement(btnaumentar).click();
        interactorTime.esperaMilis(1000);
        getDriver().findElement(btnaumentar).click();
        interactorTime.esperaMilis(1000);
        getDriver().findElement(btnaumentar).click();
        interactorTime.esperaMilis(2000);
    }

}
