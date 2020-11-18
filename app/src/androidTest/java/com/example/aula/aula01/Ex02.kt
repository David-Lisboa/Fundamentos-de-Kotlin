package com.example.aula.aula01

//2. Desenvolva um algoritmo com duas variáveis do tipo Double e imprima a soma das mesmas
fun main() {
    println("Digite o 1º numero: ")
    val a: Double = readLine()!!.toDouble()

    println("Digite o 2º numero: ")
    val b: Double = readLine()!!.toDouble()

    val resultado : Double = a + b

    println("Resultado: $resultado");
}