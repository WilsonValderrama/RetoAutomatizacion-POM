package com.amazon.Steps;

import com.amazon.PageObject.PaginaPrincipalPageObject;
import com.amazon.PageObject.PaginaProductoPageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class PaginaProductoStep {

    PaginaPrincipalPageObject paginaPrincipalPageObject = new PaginaPrincipalPageObject();
    PaginaProductoPageObject paginaProductoPageObject = new PaginaProductoPageObject();

    @Step
    public void click(By elemento){
        paginaPrincipalPageObject.getDriver().findElement(elemento).click();
    }

    @Step
    public void EscogerSeccionProducto(){
        click(paginaProductoPageObject.getHlkProductoEscogido());
    }


}
