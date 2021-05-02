fun main() {
    val lista = Testes()
    lista.forEach { i ->
        println(i)
    }
}

private fun Testes(): MutableList<String> {
    val hexadecimal = """0[a-zA-Z].*""".toRegex()
    val decimal = """[a-zA-Z].*""".toRegex()
    val lista = mutableListOf<String>()
    var teste = true

    while (teste) {

        val leitura = readLine()!!.toString()

        when {
            !leitura.contains(hexadecimal) && leitura.toInt() > 0 && leitura.toInt() < Integer.MAX_VALUE -> {
                val n = leitura.toInt()
                val decimal = Integer.toHexString(n).toUpperCase()
                val decimalC = "0x$decimal"
                lista.add(decimalC)
            }
        }

        when {
            leitura.contains(hexadecimal) && leitura.contains(decimal) -> {
                val remove = leitura.removeRange(0, 2)
                val result: Int = remove.toInt(16)
                lista.add(result.toString())
            }
        }

        // Para finalizar
        if (leitura == "-1") {
            teste = false
        }
    }
    return lista
}