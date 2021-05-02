fun main() {
    val leitura = readLine()?.toInt() ?: 0
    for (i in 1..leitura) {
        val x = readLine()?.toDouble() ?: 0.0
        println(Teste(x))
    }
}

fun Teste(teste: Double): String{
    if( teste == 1.0 ) {
        return "Not Prime"
    }
    var i = 2.0
    while (i * i <= teste) {
        if (teste % i == 0.0) {
            return "Not Prime"
        }
        i++
    }
    return "Prime"
}