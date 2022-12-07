package com.amazon.PageObject;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.amazon.com/-/es/")
public class PaginaPrincipalPageObject extends PageObject {

    By hlkInicioSesion = By.xpath("//a[contains(@href, 'https://www.amazon.com/-/es/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F-%2Fes%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&')]");

    By hlkProducto = By.xpath("//a[contains(@href, '/-/es/b?node=17938598011')]");


    public By getHlkInicioSesion() {
        return hlkInicioSesion;
    }

    public By getHlkProducto() {
        return hlkProducto;
    }
}
