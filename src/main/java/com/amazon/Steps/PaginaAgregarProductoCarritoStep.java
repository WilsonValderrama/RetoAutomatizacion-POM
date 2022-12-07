package com.amazon.Steps;

import com.amazon.PageObject.PaginaAgregarProductoCarritoPageObject;
import com.amazon.PageObject.PaginaPrincipalPageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class PaginaAgregarProductoCarritoStep {

    PaginaPrincipalPageObject paginaPrincipalPageObject = new PaginaPrincipalPageObject();

    PaginaAgregarProductoCarritoPageObject paginaAgregarProductoCarritoPageObject = new PaginaAgregarProductoCarritoPageObject();


    @Step
    public void click(By elemento){
        paginaPrincipalPageObject.getDriver().findElement(elemento).click();
    }

    @Step
    public void agregarProductoCarrito(){
        click(paginaAgregarProductoCarritoPageObject.getBtnAgregarCarrito());
    }

}
