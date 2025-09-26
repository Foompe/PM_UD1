package Practicas.Practica23

data class Task(val title: String, val completed: Boolean = false) {

    // 2. Función de orden superior para filtrar tareas
    fun filterTasks(tasks: List<Task>, criterio: (Task) -> Boolean): List<Task> {



    }

    // 3. Función de extensión para mostrar tareas
    fun List<Task>.printTasks() {
        ([x] si está completada, [ ] si no)

    }

    // 4. Función infix para comparar títulos de tareas
    infix fun Task.sameTitleAs(other: Task): Boolean {

    }
}