package com.amazon.Steps;

import com.amazon.Models.Validacion;
import com.amazon.PageObject.PaginaIniciarSesionCorreoPageObject;
import com.amazon.PageObject.PaginaPrincipalPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class PaginaValidacionCarritoStep {

    PaginaPrincipalPageObject paginaPrincipalPageObject = new PaginaPrincipalPageObject();
    Validacion validacion = new Validacion();


    @Step
    public void validarProductoCarrito(){
        Assert.assertThat(paginaPrincipalPageObject.getDriver().findElement(validacion.getLblValidacionCompra())
                .isDisplayed(), Matchers.is(true));
    }



}
