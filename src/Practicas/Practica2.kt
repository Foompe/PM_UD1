package Practicas

fun main() {
    println("Introduce una cadena de texto")
    val cadena : String = readLine() ?: "Error"
    println("Introduce un número entero que represente una posicion dentro de la cadena")
    val numero : Int = readLine()?.toInt() ?: 0


    if (!(numero <=0)) {
        println("Posicion anterior ${cadena[numero-1]}")
    }

    println("Posicion central ${cadena[numero]}")

    if(numero <= cadena.length-2) {
        println("Posicion siguiente ${cadena[numero+1]}")
    }

}