package com.example.aula.aula02

import java.util.function.DoubleBinaryOperator

//6. Utilizando o loop de repetição for, desenvolva um algoritmo que imprima qualquer tabuada

fun main() {
    val lista = arrayListOf("+", "-", "*", "/")

    fun tabuada(numero: Double, operacao: String) {

        if (operacao == lista[0]) {
            for (i in 1..10) {
                println("$numero + $i = ${numero + i}")
            }
        } else if (operacao == lista[1]) {
            for (i in 1..10) {
                println("$numero - $i = ${numero - i}")
            }
        } else if (operacao == lista[2]) {
            for (i in 1..10) {
                println("$numero x $i = ${numero * i}")
            }
        } else if (operacao == lista[3]) {
            for (i in 1..10) {
                val multi: Double = numero / i
                println("$numero / $i = ${numero / i}")
            }
        } else {
            println("ERRO!!")
        }
    }

    print("Digite o numero: ")
    val numero: Double = readLine()!!.toDouble()

    print("Digite uma das operações '+', '-', '*', '/': ")
    val opercao: String = readLine()!!.toString()

    println("\nTabuada de $opercao de $numero:")
    tabuada(numero, opercao)

}
