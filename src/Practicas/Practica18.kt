package Practicas

fun main() {
    val libro = libro("El nombre del viento","Patrick Rotfuss", 2000)
    val(titulo,autor,ano) = libro
    println("El libro $titulo del autor $autor fue publicado en el año $ano")
}

class libro(val nombre: String, val autor : String, val anioPublicacion: Int) {
    operator fun component1(): String = nombre
    operator fun component2(): String = autor
    operator fun component3(): Int = anioPublicacion
}