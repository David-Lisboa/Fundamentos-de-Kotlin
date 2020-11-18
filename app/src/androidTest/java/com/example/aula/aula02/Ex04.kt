package com.example.aula.aula02

//4. Utilizando a estrutura condicional e operadores lógicos, desenvolva um algoritmo que simule
// um sistema de login

fun main() {

    val lista = arrayListOf("DD","123")

    fun login(usuario: String, senha: String): String {

        return if (usuario == lista[0] && senha == lista[1]) {
            "Correto\n!!Logado com sucesso!!"
        }else{
            "Incorreto\nTente novamente"
        }
    }

    print("Digite o usuario: ")
    val usuario :String = readLine()!!.toString()

    print("Digite a senha: ")
    val senha :String = readLine()!!.toString()

    print("\nusuario e senha ${login(usuario, senha)}\n")
}