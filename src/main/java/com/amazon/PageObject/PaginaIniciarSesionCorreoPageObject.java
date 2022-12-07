package com.amazon.PageObject;

import org.openqa.selenium.By;

public class PaginaIniciarSesionCorreoPageObject {

    By txtUsuario = By.xpath("//input[@name='email']");

    By btnContinuar = By.xpath("//input[@id='continue']");

    public By getTxtUsuario() {
        return txtUsuario;
    }

    public By getBtnContinuar() {
        return btnContinuar;
    }
}
