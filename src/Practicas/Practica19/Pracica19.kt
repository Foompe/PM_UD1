package Practicas.Practica19

import Practicas.libro

fun main() {

    val biblioteca = listOf(
        Novela("titulo1","autor1",1200),
        Novela("titulo2","autor2",12),
        Novela("ww","TT",5)
    )

    for((titulo, autor, anio) in biblioteca) {
        println("La novela $titulo del autor $autor fue publicada en el año $anio")
    }

    println("----")

    //parte foreach y lambdas
    biblioteca.forEach { (titulo,_,anio) ->
        println("La novela $titulo fue publicada en el año $anio")
    }
}