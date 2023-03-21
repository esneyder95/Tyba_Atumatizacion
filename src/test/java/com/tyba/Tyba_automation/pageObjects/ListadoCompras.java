package com.tyba.Tyba_automation.pageObjects;

import com.tyba.Tyba_automation.utils.InteractorTime;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ListadoCompras extends PageObject {
    InteractorTime interactorTime = new InteractorTime();
    public By pruductouno = By.xpath("//table[@class='fixedTableEdgeCompatibility']/tbody/tr[1]");
    public By removerproductouno = By.xpath("//table[@class='fixedTableEdgeCompatibility']/tbody/tr[1]/td[6]/span/a[3]");
    public By pruductodos = By.xpath("//table[@class='fixedTableEdgeCompatibility']/tbody/tr[2]");
    public By pruductotres = By.xpath("//table[@class='fixedTableEdgeCompatibility']/tbody/tr[3]");
    public By btncheckout = By.xpath("//button[@class='roboto-medium tami uft-class ng-binding']");
    public void verificarproductoscarrito(String cantidad){
        int i = 0;
        switch (cantidad){
            case "uno": {
                i = 0;
                try {
                    getDriver().findElement(pruductouno).getText();
                    i++;
                }catch (NoSuchElementException exception){
                    System.out.println("Se encontraron " + i + " prodcutos agregados");
                }
                if (i==1){
                    System.out.println("Se agrego el producto exitosamente");
                }else{
                    try {
                        i = 1/0;
                    }catch (Exception e){
                        throw new RuntimeException("El boton de agregar carrito no funciono");
                    }
                }
                getDriver().findElement(pruductouno).click();
                interactorTime.esperaMilis(5000);
                getDriver().findElement(removerproductouno).click();
                interactorTime.esperaMilis(2000);
                break;
            }
            case "dos": {
                i = 0;
                try {
                    getDriver().findElement(pruductouno).getText();
                    i++;
                    getDriver().findElement(pruductodos).getText();
                    i++;
                }catch (NoSuchElementException exception){
                    System.out.println("Se encontraron " + i + " prodcutos agregados");
                }
                if (i==2){
                    System.out.println("Se agrego el producto exitosamente");
                }else{
                    try {
                        i = 1/0;
                    }catch (Exception e){
                        throw new RuntimeException("El boton de agregar carrito no funciono");
                    }
                }
                getDriver().findElement(pruductouno).click();
                interactorTime.esperaMilis(5000);
                getDriver().findElement(removerproductouno).click();
                interactorTime.esperaMilis(2000);
                getDriver().findElement(removerproductouno).click();
                interactorTime.esperaMilis(2000);
                break;
            }
            case "tres": {
                i = 0;
                try {
                    getDriver().findElement(pruductouno).getText();
                    i++;
                    getDriver().findElement(pruductodos).getText();
                    i++;
                    getDriver().findElement(pruductotres).getText();
                    i++;
                }catch (NoSuchElementException exception){
                    System.out.println("Se encontraron " + i + " prodcutos agregados");
                }
                if (i==3){
                    System.out.println("Se agrego el producto exitosamente");
                }else{
                        try {
                            i = 1/0;
                        }catch (Exception e){
                            throw new RuntimeException("El boton de agregar carrito no funciono");
                        }
                    }
                }
                getDriver().findElement(pruductouno).click();
                interactorTime.esperaMilis(5000);
                getDriver().findElement(removerproductouno).click();
                interactorTime.esperaMilis(2000);
                getDriver().findElement(removerproductouno).click();
                interactorTime.esperaMilis(2000);
                getDriver().findElement(removerproductouno).click();
                interactorTime.esperaMilis(2000);
                break;
            }
    }

    public void verficaroeliminarlistadocarrito(){
        try{
            getDriver().findElement(pruductouno).click();
            interactorTime.esperaMilis(5000);
            getDriver().findElement(removerproductouno).click();
            interactorTime.esperaMilis(2000);
            getDriver().findElement(removerproductouno).click();
            interactorTime.esperaMilis(2000);
            getDriver().findElement(removerproductouno).click();
            interactorTime.esperaMilis(2000);
        }catch (NoSuchElementException exception){
            System.out.println("Se borro toda la data");
        }
    }

    public void checkoutpedido(){
        getDriver().findElement(pruductouno).click();
        interactorTime.esperaMilis(5000);
        getDriver().findElement(btncheckout).click();
        interactorTime.esperaMilis(2000);
    }

}
