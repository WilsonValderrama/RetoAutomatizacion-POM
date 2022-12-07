package com.amazon.Steps;

import com.amazon.PageObject.PaginaIniciarSesionCorreoPageObject;
import com.amazon.PageObject.PaginaPrincipalPageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import java.io.IOException;

public class PaginaIniciarSesionCorreoStep {

    PaginaPrincipalPageObject paginaPrincipalPageObject = new PaginaPrincipalPageObject();

    PaginaIniciarSesionCorreoPageObject paginaIniciarSesionCorreoPageObject = new PaginaIniciarSesionCorreoPageObject();

    @Step
    public void click(By elemento){
        paginaPrincipalPageObject.getDriver().findElement(elemento).click();
    }

    @Step
    public void ingresarUsuario(String usuario) throws IOException {

        paginaPrincipalPageObject.getDriver().findElement(paginaIniciarSesionCorreoPageObject.getTxtUsuario()).sendKeys(usuario);
    }

    @Step
    public void botonContinuar(){
        click(paginaIniciarSesionCorreoPageObject.getBtnContinuar());
    }


}
