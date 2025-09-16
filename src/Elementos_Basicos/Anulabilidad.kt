package Elementos_Basicos
fun main(){

    //Verificar la Igualdad a null --> https://www.develou.com/anulabilidad-en-kotlin/
    fun showBeastsList(beasts: List<String>?) {
        if (beasts != null && beasts.isNotEmpty()) {
            beasts.forEach { println(it) }
        }
    }

    //Asignación de tipos Anulables -- Operador de acceso seguro
    val password: String? = null
    //Obtener password..
    val passwordSizez = password?.length //Puede devolver un null pero no rompe el programa

    //Operador elvis ?
    val passwordSize2 = if (password!=null) password.length else 0
    // Esto equivale a:
    val passwordSize3 = password?.length ?: 0

    //Operador !! --> Hace que si el valor que se pasa es nulo provoca una excepción
    val counter: Int? = null
    counter!!.dec()
    //NPE
    print(counter)


}