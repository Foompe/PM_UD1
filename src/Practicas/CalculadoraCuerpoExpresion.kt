package Practicas

class CalculadoraCuerpoExpresion {

    fun saludar(x: String?, t: String ? = "Doña") : String = "Buenos días $t $x"


    fun sumar(a: Int?, b: Int?) = (a ?: 0) + (b ?: 0)


    fun restar(a: Int?, b: Int?) = (a ?: 0) - (b ?: 0)


    fun multiplicar(a: Int?, b: Int?) = (a ?: 0) * (b ?: 0)


    fun dividir(a: Int?, b: Int?) = (a ?: 0) / (b ?: 0)

}