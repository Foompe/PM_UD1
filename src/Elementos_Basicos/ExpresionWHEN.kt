package Elementos_Basicos

fun main() {
    //sentencia when
    val input = 'y'

    //Se comporta como un switch
    when(input) {
        'y' -> print("Continuando...")
        'n' -> print("Cerrando...")
        else -> print("Entrada invalida")   //Similar a default
    }

    //Multiples valores como entrada
    val input2 = 2

    when (input2) {
        1, 2, 3 -> print("Te toca turno nocturno")
        4, 5, 6 -> print("Te toca turno diurno")
    }

    //Usar expresiones como condicion
    val input3 = 100

    when (input3) {
        Char.MAX_VALUE.toInt() -> print("Límite superior")
        Char.MIN_VALUE.toInt() -> print("Límite inferior")
        else -> print("No es ninguno de los límites")
    }

    //Puede tomar rangos
    print("Ingresa el número:")
    val input4 = readLine()!!.toInt()

    when (input4) {
        in 1..49 -> print("$input4 pertenece a [1..49]")
        in 50..99 -> print("$input4 pertence a [50..99]")
        else -> print("Fuera de los rangos contemplados")
    }


    //Comparar tipos
    val formResponse: Any = 12

    when (formResponse) {
        is Int -> print("Respuesta Entera")
        is String -> print("Respuesta String")
    }

    val formResponse2: Any = "12"

    when (formResponse2) {
        is Int -> {
            val times = formResponse2 * 100
            print("Respuesta Entera:$times")
        }
        is String -> {
            val times = formResponse2.toInt() * 100
            print("Respuesta String:$times")
        }
    }

    //Usar when como if
    val a = -5

    when {
        a > 0 -> print("Es positivo")
        a == 0 -> print("Es cero")
        else -> print("Es negativo")
    }


    //DEclaracion de variables en el sujeto
    val playerLucky = 0.2
    val bonus = 0.3

    when (val damage: Double = playerLucky + bonus) {
        in 0.0..0.3 -> print("Daño recibido:${damage * 10}")
        in 0.3..0.6 -> print("Daño recibido:${damage * 20}")
        in 0.6..1.0 -> print("Daño recibido:${damage * 30}")
    }

    //When como expresión: segun el caso asigna un valor diferente a la variable
    val markNumber = 4

    val markText = when (markNumber) {
        1 -> "Insuficiente"
        2 -> "Deficiente"
        3 -> "Aceptable"
        4 -> "Sobresaliente"
        5 -> "Excelente"
        else -> "No permitido"
    }

    print("La calificación es: $markText")

}
