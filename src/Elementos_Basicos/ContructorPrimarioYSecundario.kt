package Elementos_Basicos

import java.util.UUID

class ContructorPrimarioYSecundario {

    //Contructor primario
    class ContructorPrimarioYSecundario(var name: String) {
        var id: String

        init {
            id = UUID.randomUUID().toString()
        }


        //contructor secundario: Pasa el valor de name a traves del this.(name) al constructor primario
        constructor(id: String, name: String) : this(name) {
            this.id = id
        }
    }
}