package Elementos_Basicos

fun main() {

    //Tipo String
   // class String : Comparable<String>, CharSequence

   // val customerName :String = "Claudia Martinez"
    val customerName = "Claudia Martinez"           //Se puede omitir el tipo

    println(customerName[5])
    println(customerName.get(5))

    for(char in customerName) {
        print(char)
    }

    for (index in customerName.indices) {
        println(customerName[index])
    }

    println(customerName.length)


    //2.Concatenación cadenas
    val a = "José" + " Monteria"
    val b = "Cantidad de ahorros: " + 536.4
    val c = "Resultado: " + (2 + 4)

    var d = "Nueva concatenacion"
    d += '!'

    println(d)

    //3.String con multiples lineas
    val welcomeText = """
        ¡Bienvenido 
        $a
        ¿Como estas?
    """.trimMargin()  //Elimina la sangria

    println(welcomeText)

    //4.Plantillas de Strings en kotlin
    println("Tamaño del nick: ${customerName.length}")
}