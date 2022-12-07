package com.amazon.Steps;

import com.amazon.Models.Validacion;
import com.amazon.PageObject.PaginaIniciarSesionCorreoPageObject;
import com.amazon.PageObject.PaginaPrincipalPageObject;
import com.amazon.Utils.DatosExcelListas;
import com.amazon.Utils.DatosInicioSesion;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class PaginaMenuPrincipalValidacionStep {

    PaginaPrincipalPageObject paginaPrincipalPageObject = new PaginaPrincipalPageObject();
    Validacion  validacion = new Validacion();
    PaginaIniciarSesionCorreoPageObject paginaIniciarSesionCorreoPageObject = new PaginaIniciarSesionCorreoPageObject();



    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();

    @Step
    public void validarUsuario(){
        Assert.assertThat(paginaPrincipalPageObject.getDriver().findElement(validacion.getLblValidacion())
                .isDisplayed(), Matchers.is(true));
    }

    @Step
    public void ValidarIngresoUsuario() throws IOException {
        leerExcel = DatosExcelListas.readExcel("ListaDatos.xlsx","informacion");
        paginaPrincipalPageObject.getDriver().findElement(paginaIniciarSesionCorreoPageObject.getTxtUsuario())
                .sendKeys(leerExcel.get(0).get("Usuario"));
    }

    @Step
    public void validarMensaje() throws IOException {
        leerExcel = DatosExcelListas.readExcel("ListaDatos.xlsx","informacion");
        String validar = paginaPrincipalPageObject.getDriver().findElement(validacion.getLblValidacion()).getText();

        Assert.assertEquals("Hola "+leerExcel.get(0).get("Usuario"),validar);
    }

}
