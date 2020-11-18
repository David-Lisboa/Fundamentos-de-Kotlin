package com.example.aula.aula01

//5. Desenvolva um algoritmo que utilize os operadores aritméticos e imprima o antecessor e o sucessor de um número

fun main() {

    println("Digite o 1º numero: ")
    val a: Double = readLine()!!.toDouble()

    println("Digite o 2º numero: ")
    val b: Double = readLine()!!.toDouble()

    var resultado = 0.0

    resultado = a+b
    println("Resultado soma: $resultado");

    resultado = a-b
    println("Resultado subtração: $resultado");

    resultado = a*b
    println("Resultado produto: $resultado");

    resultado = a/b
    println("Resultado divisao: $resultado");

    resultado = a%b
    println("Resultado mod: $resultado");

    resultado = a-1
    println("antecessor de $a: $resultado");

    resultado = a+1
    println("sucessor de $a: $resultado");
}