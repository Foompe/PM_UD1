package Practicas
fun main() {
    val calculadora = Calculadora()

    println("Introduce un número")
    val numeroUno = readLine()?.toInt() ?:0

    println("Introduce un número")
    val numeroDos = readLine()?.toInt() ?:0

    println(" Suma: ${calculadora.sumar(numeroUno,numeroDos)}")
    println("Resta: ${calculadora.restar(numeroUno,numeroDos)}")
    println("Multiplicación: ${calculadora.multiplicar(numeroUno,numeroDos)}")

    //Estructura para tomar errores de multiplicar por 0
    try {
        println("División: ${calculadora.dividir(numeroUno, numeroDos)}")
    }catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}
