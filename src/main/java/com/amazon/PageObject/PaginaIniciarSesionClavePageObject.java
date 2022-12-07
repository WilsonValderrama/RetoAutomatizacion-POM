package com.amazon.PageObject;

import org.openqa.selenium.By;

public class PaginaIniciarSesionClavePageObject {

    By txtClave = By.xpath("//input[@name='password']");

    By btnIniciarSesion = By.xpath("//input[@id='signInSubmit']");


    public By getTxtClave() {
        return txtClave;
    }

    public By getBtnIniciarSesion() {
        return btnIniciarSesion;
    }
}
