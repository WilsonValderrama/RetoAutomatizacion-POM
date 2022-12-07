package com.amazon.Models;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Validacion extends PageObject {

    By lblValidacion = By.xpath("//span[contains(text(), 'Hola')]");

    By lblValidacionCompra = By.xpath("//*[contains(text(), 'Agregado al carrito')]");

    public By getLblValidacion() {
        return lblValidacion;
    }

    public By getLblValidacionCompra() {
        return lblValidacionCompra;
    }
}
