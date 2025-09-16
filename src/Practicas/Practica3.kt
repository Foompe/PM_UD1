package Practicas
fun main() {
    val notas =  DoubleArray(5)
    var suma: Double = 0.0
    var promedio : Double
    var notaAlta = 0.0

    //bucle para pedir notas al usuario y llenar el array
    for (i in notas.indices) {
        println("Introduce nota!")
        notas[i] = readLine()?.toDouble() ?:0.0
        suma = suma + notas.get(i)
    }
    promedio = suma / notas.size        //calculamos el promedio, usando el sumatorio


    for (i in notas.indices) {
        if (i == 0) {
            notaAlta = notas.get(i)
        } else if (notas[i] > notaAlta) {
            notaAlta = notas[i]
        }

    }

    println("Notas introducidas: ${notas.contentToString()}")    //mostramos todas las nota
    println("Suma de todas las notas: $suma")
    println("Promedio de todas las notas: $promedio")
    println("La nota mas alta es: $notaAlta")
}
