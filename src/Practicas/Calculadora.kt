package Practicas

import java.lang.IllegalArgumentException

class Calculadora {


    fun sumar(a: Int?, b:Int?): Int {
        return (a ?: 0 ) + (b ?: 0)
    }

    fun restar(a: Int?,b : Int?) : Int {
        return (a ?: 0 ) - (b ?: 0)
    }

    fun multiplicar(a: Int?,b : Int?) : Int {
        return (a ?: 0 ) * (b ?: 0)
    }

    //Añadimos un throw para caturar el error de dividir por 0
    fun dividir(a: Int?,b : Int?) : Int {
        val divisor = b ?: 0
        if (b==0) throw IllegalArgumentException("No se puede dividir por 0")
        return (a ?: 0 ) / divisor
    }

}