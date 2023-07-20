package com.example.kotlinbootcamp1.odev1

import java.util.Scanner

fun main() {
    // İlk kullanıcı adı ve şifreyi tanımlıyoruz
    val kullaniciAdi = "süRücü"
    val sifre = "sRc444"

    // Kullanıcıdan giriş bilgilerini almak için Scanner kullanıyoruz
    val scanner = Scanner(System.`in`)

    // Kullanıcı adı ve şifreyi giriş isteğiyle alıyoruz
    println("Kullanıcı adı:")
    val girilenKullaniciAdi = scanner.nextLine()

    println("Şifre:")
    val girilenSifre = scanner.nextLine()

    // Kullanıcı adı ve şifre kontrolü
    if (girilenKullaniciAdi.equals(kullaniciAdi, ignoreCase = true) && girilenSifre.equals(sifre, ignoreCase = true)) {
        println("Hoş Geldiniz!!")
    } else {
        println("Kullanıcı adı veya şifre hatalı")
    }
}