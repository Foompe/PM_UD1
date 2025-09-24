package Practicas.Practica19

class Novela(val titulo : String, val autor : String, val anioPublic: Int) {
    operator fun component1() = titulo
    operator fun component2() = autor
    operator fun component3() = anioPublic
}