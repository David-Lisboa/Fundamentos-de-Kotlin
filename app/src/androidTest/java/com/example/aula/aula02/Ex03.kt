package com.example.aula.aula02

import android.support.v4.app.INotificationSideChannel

//3. Utilizando a estrutura condicional e operadores relacionais, desenvolva um algoritmo que
// identifique se um determinado número inteiro é par ou ímpar

fun main() {

    fun parouImpar(num: Int): String {
        return if (num % 2 == 0) {
            "Par"
        }else{
            "Impar"
        }
    }

    print("Digite o numero: ")
    val num :Int = readLine()!!.toInt()

    print("$num é ${parouImpar(num)}")
}
