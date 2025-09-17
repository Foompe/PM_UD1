package Elementos_Basicos

fun main() {

    //Bucle while funciona como en java: Sumatoria
    var sum = 0
    var i = 1

    while (i <= 10) {
        sum += i++
    }

    println("Sumatoria:$sum")

    //Bucle do - while
    do {
        println("¿Cuál es la capital de Colombia?:")
        println("a. La Paz")
        println("b. Buenos Aires")
        println("c. La Habana")
        println("d. Bogotá")

        print("Respuesta:")
        val option = readLine()!!
        val again = option != "d"

        if(again){
            println("¡Incorrecto!\n")
        }else{
            println("¡Felicitaciones!\n")
        }
    } while (again)

    //Usamos break para salir del bucle

}