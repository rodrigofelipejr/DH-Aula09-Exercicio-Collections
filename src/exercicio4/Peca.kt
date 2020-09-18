package exercicio4

class Peca(var marca: String, var modelo: String) {
    fun retirada() {}

    override fun toString(): String {
        return "Peça(marca='$marca' - modelo='$modelo')"
    }
}