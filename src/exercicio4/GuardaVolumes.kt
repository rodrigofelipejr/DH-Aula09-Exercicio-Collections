package exercicio4

import exercicio4.Peca

class GuardaVolumes() {
    private var armario = mutableMapOf<Int, MutableList<Peca>>()
    private var identificador: Int = 0

    fun guardarPecas(listaPecas: MutableList<Peca>): Int {
        if (listaPecas.isEmpty())
            return -1

        identificador++
        armario.put(identificador, listaPecas)

        return identificador
    }

    fun mostrarPecas() = armario.forEach { println("${it.key} - ${it.value.toString()}") }

    fun mostrarPecas(numero: Int) = println(armario[numero])

    fun devolverPecas(numero: Int) = armario.remove(numero)
}