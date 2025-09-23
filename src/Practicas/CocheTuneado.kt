package Practicas

//constructor principal
class CocheTuneado(val marca: String, val modelo: String) {
    var vel : Int = 0
        private set

    //TODO: por terminar
   /* var marca: String = marca
        get() = field.uppercase()

    var modelo: String = modelo
        get() = field.uppercase()

    var velocidad: Int = 0
        set(value) {
            field = if(value >= 0) value = velocidad
        }*/

    //constructor secundario
    //TODO: Personalizar el getter marca y modelo para que lo devuelva en mayus
    //TODO: Personalizar el setter para que no admita valores negativos
    constructor(marca: String, modelo: String, velocidad: Int) : this(marca, modelo) {
        if (velocidad <= 0) {
            vel = velocidad
        } else {
            vel = 0
        }
    }

    fun acelerar(x: Int) {
        if (x > 0) {
            vel += x
            println("Acelerando $marca $modelo = $vel")
        }
    }

    fun frenar(x: Int) {
        vel -= x
        if (vel < 0) {
            vel = 0
            println("Frenando $marca $modelo = $vel")
        }
    }
}

fun main() {
    val c1 = CocheTuneado("Toyota", "Celica")
    val c2 = CocheTuneado("Ford", "Mondeo", 10)
    val c3 = CocheTuneado("Citroen", "C3", 20)

    c1.acelerar(50)
    c2.frenar(40)
    c3.acelerar(43)
    c3.frenar(50)

    println("CocheT1 = ${c1.marca} ${c1.modelo}, velodidad: ${c1.vel}")
    println("CocheT1 = ${c2.marca} ${c2.modelo}, velodidad: ${c2.vel}")
    println("CocheT1 = ${c3.marca} ${c3.modelo}, velodidad: ${c3.vel}")
}
