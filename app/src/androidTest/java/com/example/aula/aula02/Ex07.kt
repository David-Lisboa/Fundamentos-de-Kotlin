package com.example.aula.aula02

//7. Utilizando o loop de repetição for, desenvolva um algoritmo que conte a quantidade de vogais
// em uma String
fun main() {
    val listaVogal = arrayListOf('a', 'e', 'i', 'o', 'u')

    fun contarVogal(texto: String):Int {
        var x : Int = 0
//      MODO 1
//        for (element in texto) {
//            for (j in 0 until listaVogal.size) {
//                if (element in listaVogal[j]) {
//                    x++
//                }
//            }
//        }
//        return x

//      MODO 2
        for (element in texto) {
            if (element in listaVogal) {
                x++
            }
        }
        return x
    }

    print("Digite uma frase: ")
    val texto: String =  readLine()!!.toString()

    print("\n\n'$texto'\nPossui ${contarVogal(texto.toLowerCase())} vogais\n")

}