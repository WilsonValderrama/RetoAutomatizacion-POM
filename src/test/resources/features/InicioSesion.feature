#language: es

  Característica: Inicio de sesion

    @InicioSesion
    Escenario: Inicio de sesion exitoso
      Dado que el usuario se encuentre en la pagina
      Cuando el usuario ingrese con la clave
        | Usuario                       | Clave         |
        | wilson.valderrama10@gmail.com | WilsonSqa2022 |
      Entonces el usuario visualizara el nombre de usuario en el menu de navegacion