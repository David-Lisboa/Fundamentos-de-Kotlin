package com.example.aula.aula01

//6. Desenvolva um algoritmo que calcule e imprima o total de dias em 7 meses, considerando que cada mês tenha 30 dias

fun main() {

    println("Digite o numero de meses: ")
    val a: Double = readLine()!!.toDouble()
    
    val totalDeDias = a*30

    println("Total de dias em $a meses é: $totalDeDias");
}