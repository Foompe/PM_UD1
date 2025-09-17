package Practicas

fun main() {
    println("Introduce peso")
    val peso : Double = readLine()?.toDouble() ?: 0.0
    println("Introduce altura")
    val altura : Double = readLine()?.toDouble() ?: 0.0

    val IMC : Double = peso / (altura*altura)

    val resultado = when (IMC) {
        in 0.0..18.5 -> "Bajo peso"
        in 18.6..25.0 -> "Normal"
        in 25.1..30.0 -> "Sobrepeso"
        in 30.0..99.9 -> "E"
        else -> {"Error"}
    }

    println(resultado)
}