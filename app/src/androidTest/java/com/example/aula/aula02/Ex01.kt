package com.example.aula.aula02

//1. Crie funções para as 4 operações aritméticas básicas

fun main() {

    fun  operacoesAritmeticas(num1:Double, num2:Double){
        var  resultado : Double = num1 + num2
        println("\n$num1 + $num2 = $resultado")

        resultado = num1 - num2
        println("$num1 - $num2 = $resultado")

        resultado = num1 * num2
        println("$num1 * $num2 = $resultado")

        resultado = num1 / num2
        println("$num1 / $num2 = $resultado")
    }

    print("Digite o numero 1 numero: ")
    var num3 : Double = readLine()!!.toDouble()

    print("Digite o numero 1 numero: ")
    var num4 : Double = readLine()!!.toDouble()

    operacoesAritmeticas(num3, num4)

}