package Practicas.Practica23
fun main() {
    // Creamos una lista de tareas
    val tasks = listOf(
        Task("Comprar pan"),
        Task("Estudiar lambdas"),
        Task("Practicar infix"),
        Task("Estudiar funciones de extensión", completed = true),
        Task("Ver Kotlin en YouTube", completed = true)
    )

    println("Todas las tareas:")
    tasks.printTasks()

    println(“\nTareas pendientes:")
    val pending = filterTasks(tasks) { !it.completed }
    pending.printTasks()

    println(“\nTareas completadas:")
    val finished = filterTasks(tasks) { it.completed }
    finished.printTasks()

    println(“\nComparación de títulos:")
    val t1 = tasks[0]
    val t2 = tasks[3]
    println("¿'${t1.title}' y '${t2.title}' tienen el mismo título? -> ${t1 sameTitleAs t2}")
}

