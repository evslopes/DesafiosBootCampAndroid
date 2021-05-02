fun main() {
    val leitura = readLine()!!.toInt()
    Testes(leitura)
}

private fun Testes(testes: Int) {

    val listaNumeros = mutableListOf<Int>()
    var listStrings: List<String>
    var primeiro: Int
    var segundo: Int
    var soma: Int
    var subtracao: Int
    var multiplicacao: Int

    // Verificando números testes
    (1..testes).forEach { i ->
        // Tratando Leitura
        listStrings = readLine()!!.split(" ")
        listStrings.forEach { i ->
            primeiro = i.substring(2, 3).toInt()
            segundo = i.substring(0, 1).toInt()

            // Letras minúsculas
            if (i.contentEquals(i.toLowerCase()) && primeiro != segundo) {

                soma = primeiro.plus(segundo)
                listaNumeros.add(soma)
            }
            // Letras maiúsculas
            if (i.contentEquals(i.toUpperCase()) && primeiro != segundo) {

                subtracao = primeiro.minus(segundo)
                listaNumeros.add(subtracao)
            }
            // Números iguais
            if (i.substring(0, 1) == i.substring(2, 3)) {

                multiplicacao = primeiro.times(segundo)
                listaNumeros.add(multiplicacao)
            }
        }
    }
    listaNumeros.forEach { s ->
        println(s)
    }
}