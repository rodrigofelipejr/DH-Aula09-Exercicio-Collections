class Exercicio2 {
    fun main(){
        val conjunto1 = mutableListOf<Int>()
        val numeros = mutableListOf(1, 5, 5, 6, 7, 8, 8, 8)

        conjunto1.addAll(numeros)
        println(conjunto1)

        val conjunto2 = mutableSetOf<Int>()

        conjunto2.addAll(numeros)
        println(conjunto2)
    }
}