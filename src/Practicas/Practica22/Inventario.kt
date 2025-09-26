package Practicas.Practica22

class Inventario {
    // Diccionario que guarda los productos con su ID
    private val productos = mutableMapOf<String, Producto>()

    // Agregar un producto al inventario
    fun agregarProducto(id: String, producto: Producto) {
        if(productos.containsKey(id)) {
            println("Error: El producto ya existe")
        } else {
            productos.put(id, producto)
        }
        if (id !in productos) {
            productos[id] = producto
            println("prodructo agregado")
        } else {
            println("Error")
        }
    }

    // Actualizar el precio de un producto existente
    fun actualizarPrecio(id: String, nuevoPrecio: Double) {
        val producto = productos[id]
        if (producto != null) {
            producto.precio = nuevoPrecio

        } else {
            println("Error: El producto no existe")
        }

    }

    // Eliminar un producto por su ID
    fun eliminarProducto(id: String) {
        if(productos.remove(id) != null) {
            println("producto borrado")
        } else {
            println("Error: El producto no existe")
        }
    }

    // Mostrar todos los productos con su nombre y precio
    fun mostrarProductos() {
        if(productos.isEmpty()) {
            println("No existen elementos en la lista")
        } else {
            productos.forEach { productos -> println(productos) }
        }
    }

    // Buscar un producto por su ID
    fun buscarProductoPorId(id: String): Producto? {
    return productos[id]
    }
}
