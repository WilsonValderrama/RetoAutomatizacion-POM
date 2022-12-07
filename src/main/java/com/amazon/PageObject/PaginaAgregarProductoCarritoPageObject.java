package com.amazon.PageObject;

import org.openqa.selenium.By;

public class PaginaAgregarProductoCarritoPageObject {

    By btnAgregarCarrito = By.xpath("//input[@id = 'add-to-cart-button']");

    public By getBtnAgregarCarrito() {
        return btnAgregarCarrito;
    }
}
