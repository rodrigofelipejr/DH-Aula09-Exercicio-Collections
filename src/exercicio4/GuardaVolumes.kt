package exercicio4

class GuardaVolumes(var volumes: MutableMap<Int, MutableList<Peca>>) {
    private var identificador: Int = 0

    fun guardarPecas(listaPecas: MutableList<Peca>): Int {
        if (listaPecas.isEmpty())
            return -1

        identificador++
        volumes.put(identificador, listaPecas)

        return identificador
    }

    fun mostrarPecas() {
        volumes.forEach { println(it) }
    }

    fun mostrarPecas(numero: Int) {
        println(volumes[numero])
    }

    fun devolverPecas(numero: Int) {
        volumes.remove(numero)
    }
}