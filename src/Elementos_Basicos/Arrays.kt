package Elementos_Basicos

fun main() {

    val negativeNumbers = Array(10) { -(it + 1) }
    println(negativeNumbers.joinToString())

    //Acceso a los elementos
    val planets = arrayOfNulls<String>(8)
    planets[0] = "Mercurio"
    planets[1] = "Venus"
    planets[2] = "Tierra"
    planets[3] = "Júpiter"
    planets[4] = "Saturno"
    planets[5] = "Urano"
    planets[6] = "Neptuno"
    planets[7] = "Plutón"

    println(planets.contentToString())

    //Recorrer los elementos
    for(i in planets.indices){
        println("${planets[i]} está en la posición ${i+1}")
    }

    for(i in 0 until planets.size) {
        println("${planets[i]} esta en la posición ${i +1}")
    }

    planets.forEachIndexed { i, v ->
        println("$v está en la posición ${i+1}")
    }



}
