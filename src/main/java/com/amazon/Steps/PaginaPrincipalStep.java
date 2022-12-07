package com.amazon.Steps;

import com.amazon.PageObject.PaginaPrincipalPageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import java.io.IOException;

public class PaginaPrincipalStep {

    PaginaPrincipalPageObject paginaPrincipalPageObject = new PaginaPrincipalPageObject();


    @Step
    public void AbrirNavegador(){
        paginaPrincipalPageObject.open();
    }

    @Step
    public void click(By elemento){
        paginaPrincipalPageObject.getDriver().findElement(elemento).click();
    }

    @Step
    public void inicioSesion(){
        click(paginaPrincipalPageObject.getHlkInicioSesion());
    }

    @Step
    public void AbrirProducto(){
        click(paginaPrincipalPageObject.getHlkProducto());
    }








}
