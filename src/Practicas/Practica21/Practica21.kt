package Practicas.Practica21
fun main() {
    val gestor = GestorUsuarios()

    val u1 = Usuario("juan123", "juan@mail.com")
    val u2 = Usuario("ana89", "ana@mail.com")
    val u3 = Usuario("pepe77", "juan@mail.com") // mismo email que u1

    gestor.agregarUsuario(u1)
    gestor.agregarUsuario(u2)
    gestor.agregarUsuario(u3) // rechazado por duplicado

    gestor.mostrarUsuarios()

    gestor.buscarUsuarioPorEmail("ana@mail.com")
    gestor.buscarUsuarioPorEmail("noexiste@mail.com")
}