package com.example.aula.aula02

fun main() {

    // for
    fun usandoFor() {
        val x: Int = 6

        for (i in 1..x) {
            println("vai $i corintias")
        }
        println("\n")

        for (i in 0 until x step 2) {
            println("vai de 0 ate $x pulando de 2 em 2: $i")
        }
        println("\n")

        for (i in x downTo 1) {
            println("vai de $x ate 1 : $i")
        }
    }

    // usandoFor()


    //lista
    fun usandoLista() {
        val capitais = arrayListOf("Distrito Federam","Paris","Pequim","Roma")

        println(capitais)
        println(capitais[0])
        println("tamanho da lista = " + capitais.size) // tamanho da lista

        capitais.add("Buenos Aires")//Adicionar elemento na lista
        println(capitais)

        capitais.removeAt(2)//Remover elemento na lista
        println(capitais)

        println(capitais.random())//Obter elemento aleatorios

        for( x in capitais){
            println("$x")
        }

    }
    usandoLista()

}
