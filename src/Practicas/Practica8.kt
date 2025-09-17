package Practicas

fun main() {

    println("Introduce un numero entero")
    val numero: Int = readLine()?.toInt() ?: 0

    for (i in 1..numero) {
        if ((i % 3) == 0) {
            println(" ~ Multiplo ~ ")
            continue
        }
        if (i > 20) {
            println(" ~ El bucle ha llegado a 20 ~")
            break
        }
        print("$i ")
    }
}