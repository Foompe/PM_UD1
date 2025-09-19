package Practicas

import java.lang.IllegalArgumentException

fun main() {

    val calculadora = CalculadoraCuerpoExpresion()

    println("Introduce nombre")
    val usuario : String? = readLine()
    calculadora.saludar(usuario)
    println("Introduce numero")
    val n1 : Int = readLine()?.toInt() ?: 0
    println("Introduce otro numero")
    val n2 : Int = readLine()?.toInt() ?: 0

    calculadora.sumar(n1,n2)
    calculadora.restar(n1,n2)
    calculadora.multiplicar(n1,n2)
    calculadora.dividir(n1,n2)
    }


