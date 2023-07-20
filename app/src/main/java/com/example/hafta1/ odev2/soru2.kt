package com.example.hafta1.odev2

fun main() {
    try {
        print("Yaşınızı giriniz: ")
        val input = readLine()
        if (input != null) {
            val yas = input.toInt()

            if (yas >= 18) {
                println("Oy kullanabilirsiniz!")
            } else {
                println("Oy kullanamazsınız.")
            }
        } else {
            println("Geçerli bir yaş girmediniz.")
        }
    } catch (e: NumberFormatException) {
        println("Geçerli bir yaş girmediniz.")
    }
}
