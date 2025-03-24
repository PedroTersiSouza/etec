fun main() {
    println("Exercicio 1")
    ex1()

    println()
    println("Exercicio 2")
    ex2()

    println()
    println("Exercicio 3")
    ex3()

    println()
    println("Exercicio 4")
    ex4()

    println()
    println("Exercicio 5")
    ex5()

    println()
    println("Exercicio 6")
    ex6()

    println()
    println("Exercicio 7")
    ex7()

    println()
    println("Exercicio 8")
    ex8()

    println()
    println("Exercicio 9")
    ex9()

    println()
    println("Exercicio 10")
    ex10()
}


fun ex1() {
    val numero = 10
    if (numero > 0) {
        println("Número positivo")
    } else {
        println("Número negativo ou zero")
    }
}


fun ex2() {
    val opcao = 2
    when (opcao) {
        1 -> println("Escolheu a opção 1")
        2 -> println("Escolheu a opção 2")
        3 -> println("Escolheu a opção 3")
        else -> println("Opção inválida")
    }
}


fun ex3() {
    for (i in 1..5) {
        println("Contagem: $i")
    }
}

fun ex4() {
    val numeros = arrayOf(10, 20, 30, 40, 50, 60, 70)
    for (item in numeros) {
        println("Número: $item")
    }
}


fun ex5() {
    val numeros = arrayOf(10, 20, 30, 40, 50, 60, 70)
    if (numeros.size >= 6) {
        println("O sexto elemento é: ${numeros[5]}")
    }
}


fun ex6() {
    var contador = 0
    while (contador < 3) {
        println("Contador: $contador")
        contador++
    }
}


fun ex7() {
    val a = 10
    val b = 5
    println("Soma: ${a + b}")
}


fun ex8() {
    val a = 10
    val b = 5
    println("Subtração: ${a - b}")
}


fun ex9() {
    val a = 10
    val b = 5
    println("Multiplicação: ${a * b}")
}


fun ex10() {
    val a = 10
    val b = 5
    if (b == 0) {
        println("Erro: Divisão por zero não é permitida.")
    } else {
        println("Divisão: ${a.toDouble() / b.toDouble()}")
    }
}


