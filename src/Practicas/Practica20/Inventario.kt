package Practicas.Practica20

class Inventario {
    private val productos: MutableSet<Producto> = mutableSetOf()
    fun agregarProducto(producto: Producto) {
        // TODO: debe recibir como parámetro un Producto.
    //  Agregarlo al Set y mostrar un mensaje indicando si el producto
    //  fue añadido o si ya existía en el inventario.

        var añade = productos.add(producto)
        if(añade) {
            println("Producto $producto añadido")
        } else {
            println("Error al añadir")
        }
    }
    fun mostrarProductos() {
        // TODO: Debe imprimir en pantalla todos los productos del inventario.
    //  Si el inventario está vacío, mostrar un mensaje indicándolo. Utilizar
    //  un for con desestructuración.

        if(productos.isEmpty()) {
            println("La lista esta vacia")
        } else {
            for ((nombre,codigo) in productos) {
                println("Nombre: $nombre codigo: $codigo")
            }
        }
    }
}
