package com.example.aula.aula01

fun main(){
    //Saída de dados

    //Escrever no console sem quebra de linha
    //print("Olá,")
    //print("Mundo")

    //Escrever no console com quebra de linha
    println("Olá,")
    println("Mundo")

    //Tipos de dados: Inteiro, Decimal, Caractere, Boolean, String
    //Declarando um tipo explícito
    val idade: Byte = 30
    val peso: Float = 60.75f
    val sexo: Char = 'F'
    val genero: String = "masculino"
    val souCasado: Boolean = true

    //Inferência de Tipos
    val idadeKaory = 30 //Int
    val pesoKaory = 60.75 //Double
    val sexoKaory = 'F' //Char
    val fraseRaul = "O Raul se acha lindo"  //String
    val raulCasado = true  //Boolean
}
