package com.example.aula.aula01
import java.util.*

//7. Desenvolva um algoritmo que calcule e imprima a média das cinco notas de um aluno

fun main() {

    var x = 0
    var nota : Double = 0.0
    while (x < 5) {
        println("Digita a "+ (x+1) +"ª nota:");
        var a: Double = readLine()!!.toDouble()
        nota += a
        x++
    }
    var total = nota/5

    println("Total : $total");
}