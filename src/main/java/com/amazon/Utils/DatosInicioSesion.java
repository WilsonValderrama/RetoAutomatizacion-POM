package com.amazon.Utils;

public class DatosInicioSesion {

    String usuario;
    String clave;

    public DatosInicioSesion(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }
}
