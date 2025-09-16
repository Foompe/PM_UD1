package Elementos_Basicos

fun main() {
    val expresion = true
    val expresion2 = false

    if (expresion) {
        // Acciones si se cumple
    } else if (expresion2) {
        // Acciones si se cumple
    } else {
        // Acciones si nada se cumple
    }

    /**
     * Se pueden usar ramas como bloques:
     *  Se podemos asignar valores directamente desde el if
     */

    val enemyHeroHealth = 16
    val cardAttack = if (enemyHeroHealth <= 15) 9 else 6

    println("Ataque:$cardAttack")


}