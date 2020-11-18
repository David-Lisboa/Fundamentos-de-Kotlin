package com.example.aula.aula01

//9. Desenvolva um algoritmo que calcule o desconto na venda de um produto
fun main() {


    println("Digita o valor do produto:");
    var preco: Double = readLine()!!.toDouble()

    println("Digita o valor da desconto:");
    var desconto: Double = readLine()!!.toDouble()

    var total: Double = preco - (preco*(desconto/100))

    println(" Produto: "+ preco + "R$ \n\n Desconto: " + desconto +"% \n\n Total: " + total + "R$");
}