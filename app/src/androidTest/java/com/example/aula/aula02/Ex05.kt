package com.example.aula.aula02

//5. Desenvolva uma função que calcule o IMC de uma pessoa, imprimir o valor do IMC e
// sua classificação

fun main() {

    fun calculoImc(peso: Double, altura: Double): String {

        var imc = peso / (altura * altura)

        if (imc < 18.5) {
           return "IMC $imc \n!!Baixo peso!!"
        }else if (imc > 18.5 && imc <= 24.9){
            return "IMC $imc \n!!Peso normal!!"
        }else if (imc > 24.9 && imc <= 29.9){
            return "IMC $imc \n!!Sobrepeso!!"
        }else if (imc > 29.9 && imc <= 34.9){
            return "IMC $imc \n!!Obesidade grau I!!"
        }else if (imc > 34.9 && imc <= 39.9){
            return "IMC $imc \n!!Obesidade grau II!!"
        }else if (imc > 39.9){
            return "IMC $imc \n!!Obesidade grau III!!"
        }else{
            return "erro"
        }
    }

    print("Digite o peso: ")
    val peso :Double = readLine()!!.toDouble()

    print("Digite a altura: ")
    val altura :Double = readLine( )!!.toDouble()

    print("\n${calculoImc(peso, altura)}\n")

}