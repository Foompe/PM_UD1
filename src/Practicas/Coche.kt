package Practicas


//constructor principal
class Coche (val marca: String,val modelo: String) {
    var vel : Int = 0
        private set


//constructor secundario
constructor(marca: String,modelo: String, velocidad: Int) : this(marca,modelo){
        if(velocidad <= 0) {
            vel = velocidad
        }
    }

    fun acelerar(x : Int) {
        if (x > 0) {
            vel += x
            println("Acelerando $marca $modelo = $vel")
        }
    }

    fun frenar(x: Int){
        vel -= x
        if (vel < 0) {
            vel = 0
            println("Frenando $marca $modelo = $vel")
        }
    }
}

fun main() {
    val c1 = Coche("Toyota", "Celica")
    val c2 = Coche("Ford", "Mondeo", 10)
    val c3 = Coche("Citroen", "C3", 20)

    c1.acelerar(50)
    c2.frenar(40)
    c3.acelerar(43)
    c3.frenar(50)

    println("Coche1 = ${c1.marca} ${c1.modelo}, velodidad: ${c1.vel}")
    println("Coche1 = ${c2.marca} ${c2.modelo}, velodidad: ${c2.vel}")
    println("Coche1 = ${c3.marca} ${c3.modelo}, velodidad: ${c3.vel}")
}

