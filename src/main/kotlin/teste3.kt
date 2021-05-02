fun main() {

    val leituraTestes = readLine()
    val listaFinal = Testes(leituraTestes)

    listaFinal.forEach() { i ->
        println(i)
    }
}

private fun Testes(numTestes: String?): MutableList<Int> {
    val lista = mutableListOf<Int>()
    var soma: Int

    (1..numTestes!!.toInt()).forEach { i ->
        val leituraArgumentos = readLine()!!
        val list = leituraArgumentos!!.split(" ").map { it.toInt() }
        if (list.size == 2) {
            soma = list[0] + list[1]
            lista.add(soma)
        }
    }

    return lista
}
