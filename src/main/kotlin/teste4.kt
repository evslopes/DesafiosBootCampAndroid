fun main() {

    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',', '.')
    val salario = readLine()!!.toFloat()
    val testeFinal = Testes(salario)

    if (testeFinal == 0.0F) {
        println("Isento")
    } else {
        println("R$ ${testeFinal.format(2)}")
    }
}

fun Testes(salario: Float): Float {

    var imposto: Float = 0.0F

    if (salario in 2000.01..3000.00) {
        imposto = (salario - 2000) * 0.08.toFloat()
    }
    //18% de Imposto de Renda.
    else if (salario in 3000.01..4500.00) {
        imposto = (salario - 3000) * 0.18.toFloat() + 1000.00.toFloat() * 0.08.toFloat()

    }
    //28% de Imposto de Renda.
    else if (salario > 4500) {
        imposto =
            ((salario - 4500.00) * 0.28.toFloat() + 1500.00.toFloat() * 0.18.toFloat() + 1000.00.toFloat() * 0.08.toFloat()).toFloat()
    }

    return imposto
}


