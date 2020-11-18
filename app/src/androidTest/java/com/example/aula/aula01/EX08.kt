package com.example.aula.aula01

//8. Desenvolva um algoritmo que converta metros para centímetros e imprima o resultado
fun main() {


    println("Digita o valor em metros:");
    var a: Double = readLine()!!.toDouble()

    var metros = a*100

    println(""+ a + "M é " + metros +"cm");
}