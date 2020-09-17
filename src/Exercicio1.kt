class Exercicio1 {
    fun main() {
        val loteria =
            mutableMapOf(0 to "Ovos", 1 to "Água", 2 to "Escopeta", 3 to "Cavalo", 4 to "Dentista", 5 to "Fogo")
        loteria.forEach { println(it) }

        val apelidos = mutableMapOf(
            "João" to listOf("Juan", "Fissura", "Maromba"),
            "Miguel" to listOf("Night Watch", "Bruce Wayne", "Tampinha"),
            "Maria" to listOf("Wonder Woman", "Mary", "Marilene"),
            "Lucas" to listOf("Lukinha", "Jorge", "George")
        )
        apelidos.forEach { println(it) }
    }
}