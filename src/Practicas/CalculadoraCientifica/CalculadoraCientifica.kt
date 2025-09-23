package Practicas.CalculadoraCientifica

import kotlin.math.pow
import kotlin.math.sqrt

class CalculadoraCientifica(a : Double,b: Double) : CalculadoraBase(a,b) {

    fun cuadrado() = a.pow(b)

    fun raizCuadrada() = sqrt(this.a)

}