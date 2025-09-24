package Practicas
/*TODO:.- Crea una instancia de Usuario en main. Desestructura la instancia para obtener nombre y
*         edad solo, ignorando email. Imprime algo como:
*		  "Usuario: Ana tiene 15 años" */

fun main() {
    val user = Usuario2("Ana", 15, "ana@gmail.com")
    println("Usuario: ${user.component1()} tiene ${user.component2()} años")

    val (nombre, edad ,_) = user
    println("Usuario: $nombre tiene $edad años")

}

//Practica data class
data class Usuario2(val nombre: String, val edad: Int, val email: String)