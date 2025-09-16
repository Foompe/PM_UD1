package Elementos_Basicos

fun main() {

    //1.Conversión de tipos

    val level: Short = 75
    val first: Int = level.toInt() //convertimos un short a int

    //convierte pero pierde datos
    val measure = 4005215
    println("toshort():${measure.toShort()}")

}