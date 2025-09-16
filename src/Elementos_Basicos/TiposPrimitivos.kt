package Elementos_Basicos
fun main(){

    //1.Literales y constantes para binarios y hexadecimales

    val bitmapLocation = 0b00100001  //literal binario 0b ó 0B
    val chestColor = 0xCCC           ///Literal hexadecimal 0x ó 0X

    println(bitmapLocation) //33
    println(chestColor)     //3276

    //Números reales

    val attackSpeed: Float = 0.5f
    val dodgeChance: Double = 0.2

    //Literales reales

    val exp1 = 3.211e2
    val exp2 = .0001e10
    val exp3 = 48e5
    val exp4 = 10e-4

    println(exp1)
    println(exp2)
    println(exp3)
    println(exp4)

    print("Uno\nDos\nTres") //salto de carro

    //Booleanos

    val prueba = true

}
