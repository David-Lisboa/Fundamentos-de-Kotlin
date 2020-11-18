package com.example.aula.aula02

fun main() {
    //Função: pequenos blocos de código reutilizavel

    fun dizerOla() {
        println("Olá Desenvolvedor Android!")
    }

    fun somar(valor1: Int, valor2: Int): Int {
        return valor1 + valor2
    }

    //  dizerOla()
    // println(somar(2,5))

    // == igual à
    // != Diferente de
    // > Maior que
    // >= maior ou igual
    // <= menor ou igual

    println("Macaco == macaco")
    println("Macaco" == "macaco")

    println("\nmacaco == macaco")
    println("macaco" == "macaco")

    println("\n10 > 5")
    println(10 > 5)

    println("\n-10 > 5")
    println(-10 > 5)

    println("\n5 > -10")
    println(5 > -10)

    println("\n10 < 5")
    println(10 < 5)

    println("\n7 >= -7")
    println(7 >= -7)

    println("\n7 <= -7")
    println(7 <= -7)

    println("\nOperadores lógicos\n")

    // Operadores lógicos
    // && Operador AND (e)
    // || Operador OR (ou)
    // ! Operador NOT (não)

    print("\ntrue && true = ")
    print(true && true)

    print("\ntrue && false = ")
    print(true && false)

    print("\nfalse && true = ")
    print(false && true)

    print("\nfalse && false = ")
    print(false && false)


    print("\n\ntrue || true = ")
    print(true || true)

    print("\ntrue || false = ")
    print(true || false)

    print("\nfalse || true = ")
    print(false || true)

    print("\nfalse || false = ")
    println(false || false)


    print("\n!true = ")
    println(!true)

    println("\nOperadores lógicos combinados com relacionais\n")

    print("\n(1 > 2 && 'a' == 'a') = ")
    println(1 > 2 && 'a' == 'a')

    print("\n(10 != 1 && 5 <= 5) = ")
    println(10 != 1 && 5 <= 5)

    print("\n(5 == 1 || 10 < 11) = ")
    println(5 == 1 || 10 < 11)

    println("\nEstrutura condicional: permite ao programa tomar decisão \n")

    val clima = "chuva"

    if (clima == "chuva"){
        println("Leve guarda-chuva")
    }else {
        println("Meus sensores não detectam nada")
    }
}