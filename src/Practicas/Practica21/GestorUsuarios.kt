package Practicas.Practica21

// Clase que gestiona el registro de usuarios con una lista
class GestorUsuarios {
    // Usamos una MutableList para almacenar usuarios
    private val usuarios: MutableList<Usuario> = mutableListOf()

    // Función para agregar un usuario evitando duplicados por email
    fun agregarUsuario(usuario: Usuario): Boolean {
        if (usuarios.any { it.email == usuario.email }) { // esto es un lambda
            println("Error: El correo ya esta registrado")
            return false
        }
        usuarios.addLast(usuario)
        println("Usuario añadido correctamente")
        return true
    }

    // Función para mostrar todos los usuarios
    fun mostrarUsuarios() {
        usuarios.forEach { usuario -> println(usuario) } //Esto es otro lambda
    }

    // Función para buscar un usuario por email
    fun buscarUsuarioPorEmail(email: String): Usuario? {
        val usuario = usuarios.find { it.email == email }
        return if (usuario != null) {
            println("Usuario encontrado: ${usuario.username} (${usuario.email})")
            usuario
        } else {
            println("No se encontró ningún usuario con el email '$email'.")
            null
        }
    }
}