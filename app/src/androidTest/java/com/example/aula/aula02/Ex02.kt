package com.example.aula.aula02

//2. Utilizando a estrutura condicional, desenvolva um algoritmo que determine se uma pessoa é maior ou menor de idade

fun main() {

    fun  determinarSeAdulto(idade:Int): String{

        if (idade > 17){
            return "Maior de idade"
        }else{
            return "Menor de idade"
        }
    }

    print("Digite a idade: ")
    var idade : Int = readLine()!!.toInt()

    print(determinarSeAdulto(idade))

}