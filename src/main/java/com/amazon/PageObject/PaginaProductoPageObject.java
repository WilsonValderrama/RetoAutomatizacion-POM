package com.amazon.PageObject;

import org.openqa.selenium.By;

public class PaginaProductoPageObject {

    By hlkProductoEscgido = By.xpath("//a[contains(@href, '/-/es/Paquete-alcalinas-AA-rendimiento-econ%C3%B3mico/dp/B00MNV8E0C/ref=lp_17938598011_1_1')]");

    public By getHlkProductoEscogido() {
        return hlkProductoEscgido;
    }
}
