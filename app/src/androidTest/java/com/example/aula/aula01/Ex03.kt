package com.example.aula.aula01
import kotlin.math.pow

//3. Desenvolva um algoritmo que imprima o valor ao quadrado de um número
fun main() {

    println("Digite o o numero: ")
    val a: Double = readLine()!!.toDouble()

    val resultado = a.pow(2)

    println("Resultado: $resultado");
}