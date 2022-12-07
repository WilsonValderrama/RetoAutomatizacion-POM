package com.amazon.StepDefinitions;

import com.amazon.Steps.PaginaIniciarSesionClaveStep;
import com.amazon.Steps.PaginaIniciarSesionCorreoStep;
import com.amazon.Steps.PaginaMenuPrincipalValidacionStep;
import com.amazon.Steps.PaginaPrincipalStep;
import com.amazon.Utils.DatosInicioSesion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;
import java.util.List;

public class InicioSesionStepDefinitions {

    @Steps
    PaginaPrincipalStep paginaPrincipalStep;

    @Steps
    PaginaIniciarSesionCorreoStep paginaIniciarSesionCorreoStep;

    @Steps
    PaginaIniciarSesionClaveStep paginaIniciarSesionClaveStep;

    @Steps
    PaginaMenuPrincipalValidacionStep paginaMenuPrincipalValidacionStep;

    @Dado("^que el usuario se encuentre en la pagina$")
    public void queElUsuarioSeEncuentreEnLaPagina() {
        paginaPrincipalStep.AbrirNavegador();
        paginaPrincipalStep.inicioSesion();

    }

    @Cuando("^el usuario ingrese con la clave$")
    public void elUsuarioIngreseConLaClave(List<DatosInicioSesion> datosInicioSesionList ) throws IOException{
        paginaIniciarSesionCorreoStep.ingresarUsuario(datosInicioSesionList.get(0).getUsuario());
        paginaIniciarSesionCorreoStep.botonContinuar();
        paginaIniciarSesionClaveStep.ingresarClave(datosInicioSesionList.get(0).getClave());
        paginaIniciarSesionClaveStep.botonIniciarSesion();
    }

    @Entonces("^el usuario visualizara el nombre de usuario en el menu de navegacion$")
    public void elUsuarioVisualizaraElNombreDeUsuarioEnElMenuDeNavegacion() throws IOException {
        paginaMenuPrincipalValidacionStep.validarMensaje();

    }

}
