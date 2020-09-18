package exercicio4

import exercicio4.Peca

fun main() {
    val p1 = Peca("Marca1", "Modelo1")
    val p2 = Peca("Marca2", "Modelo2")
    val p3 = Peca("Marca3", "Modelo3")
    val p4 = Peca("Marca4", "Modelo4")
    val p5 = Peca("Marca5", "Modelo5")

    val vol1 = mutableListOf(p1, p2)
    val vol2 = mutableListOf(p3, p4, p5)

    val guardaVolumes = GuardaVolumes()

    val key1 = guardaVolumes.guardarPecas(vol1)
    println("vol1 - $key1")

    val key2 = guardaVolumes.guardarPecas(vol2)
    println("vol2 - $key2")

    println()

    println("Todas as peças:")
    guardaVolumes.mostrarPecas()

    println()

    println("Peças do volume 2")
    guardaVolumes.mostrarPecas(2)

    println()

    println("Devolvendo volume 2 - ${guardaVolumes.devolverPecas(2)}")

    println()

    println("Todas as peças:")
    guardaVolumes.mostrarPecas()
}