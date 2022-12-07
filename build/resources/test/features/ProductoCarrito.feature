#language: es

  Característica: Agregar producto a carrito

    Antecedentes:
      Dado que el usuario se encuentre en la pagina
      Cuando el usuario ingrese con la clave
        | Usuario                       | Clave         |
        | wilson.valderrama10@gmail.com | WilsonSqa2022 |

    @AgregarProducto
    Escenario: Producto agregado al carrito exitoso
      Dado el usuario se encuentre en la pagina de producto
      Cuando el usuario escoja el producto
      Entonces el visualizara un mensaje de que el producto fue agregado exitosamente


