package Practicas

import kotlin.math.PI

fun main() {
    val cuadrado1 = Cuadrado(10.0)
    cuadrado1.tituloResultado()
    println("Perímetro del cuadrado : ${cuadrado1.calcularPerimetro()}")
    println("Superficie del cuadrado : ${cuadrado1.calcularSuperficie()}")

    val rectangulo1 = Rectangulo(10.0, 5.0)
    rectangulo1.tituloResultado()
    println("Perímetro del rectángulo : ${rectangulo1.calcularPerimetro()}")
    println("Superficie del rectángulo : ${rectangulo1.calcularSuperficie()}")

    val circulo1 = Circulo(5.0)
    circulo1.tituloResultado()
    println("Perímetro del circulo: ${circulo1.calcularPerimetro()}")
    println("Superficie del circulo : ${circulo1.calcularSuperficie()}")
}

interface Figura {
    fun calcularSuperficie(): Double
    fun calcularPerimetro(): Double
    fun tituloResultado() {
        println("Datos de la figura")
    }
}

class Cuadrado(val x: Double) : Figura {
    override fun calcularPerimetro() = x*4
    override fun tituloResultado()=println("Cuadrado")
    override fun calcularSuperficie()= x*x
}

class Rectangulo(val x: Double, val y: Double) : Figura {
    override fun calcularPerimetro()=x*2+y*2
    override fun tituloResultado()=println("Rectangulo")
    override fun calcularSuperficie()= x*y
}

class Circulo(val x: Double) : Figura {
    override fun calcularPerimetro()=2*Math.PI*x
    override fun tituloResultado()=println("Circulo")
    override fun calcularSuperficie()=Math.PI*x*x
}

