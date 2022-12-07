package com.amazon.StepDefinitions;

import com.amazon.Steps.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class ProductoCarritoStepDefinitions {

    @Steps
    PaginaPrincipalStep paginaPrincipalStep;

    @Steps
    PaginaProductoStep paginaProductoStep;

    @Steps
    PaginaAgregarProductoCarritoStep paginaAgregarProductoCarritoStep;

    @Steps
    PaginaValidacionCarritoStep paginaValidacionCarritoStep;

    @Steps
    PaginaMenuPrincipalValidacionStep paginaMenuPrincipalValidacionStep;

    @Dado("^el usuario se encuentre en la pagina de producto$")
    public void el_usuario_se_encuentre_en_la_pagina_de_producto() {
        paginaPrincipalStep.AbrirProducto();
        paginaProductoStep.EscogerSeccionProducto();
    }


    @Cuando("^el usuario escoja el producto$")
    public void el_usuario_escoja_el_producto() {
        paginaAgregarProductoCarritoStep.agregarProductoCarrito();
    }

    @Entonces("^el visualizara un mensaje de que el producto fue agregado exitosamente$")
    public void el_visualizara_un_mensaje_de_que_el_producto_fue_agregado_exitosamente() throws IOException {
        paginaValidacionCarritoStep.validarProductoCarrito();


    }


}
