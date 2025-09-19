package Elementos_Basicos

fun main() {

    //Declaracion normal
    fun square(x: Int): Int {
        return x * x
    }

    //Funcion con cuerpo de Expresion
    fun model(x: Int, y: Int, z: Int) = 3 * x - 2 * y + z * z


    fun main() {
        println("f(1,0,5)= ${model(1, 0, 5)}")
    }

    //Retorno tipo Unit : similar al void en java
    fun isVowel(c: Char): Unit {
        when (c) {
            'a', 'e', 'i', 'o', 'u' -> println("$c es una vocal")
            else -> println("$c no es una vocal")
        }
    }

    fun main2() {
        isVowel('v')
    }


    //Sepuede omitir el tipo unit
    fun isVowel2(c: Char) {
        when (c) {
            'a', 'e', 'i', 'o', 'u' -> println("$c es una vocal")
            else -> println("$c no es una vocal")
        }
    }

}
