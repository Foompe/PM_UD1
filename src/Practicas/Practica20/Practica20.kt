package Practicas.Practica20

fun main() {
    val inventario = Inventario()
    val p1 = Producto("Teclado", "P001")
    val p2 = Producto("Ratón", "P002")
    val p3 = Producto("Teclado", "P001") // Duplicado
    inventario.agregarProducto(p1)
    inventario.agregarProducto(p2)
    inventario.agregarProducto(p3)
    inventario.mostrarProductos()
}
