package com.amazon.Steps;

import com.amazon.PageObject.PaginaIniciarSesionClavePageObject;
import com.amazon.PageObject.PaginaPrincipalPageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import java.io.IOException;

public class PaginaIniciarSesionClaveStep {

    PaginaPrincipalPageObject paginaPrincipalPageObject = new PaginaPrincipalPageObject();

    PaginaIniciarSesionClavePageObject paginaIniciarSesionClavePageObject = new PaginaIniciarSesionClavePageObject();

    @Step
    public void click(By elemento){
        paginaPrincipalPageObject.getDriver().findElement(elemento).click();
    }

    @Step
    public void ingresarClave(String clave) throws IOException {
        paginaPrincipalPageObject.getDriver().findElement(paginaIniciarSesionClavePageObject.getTxtClave()).sendKeys(clave);
    }

    @Step
    public void botonIniciarSesion(){
        click(paginaIniciarSesionClavePageObject.getBtnIniciarSesion());
    }

}
