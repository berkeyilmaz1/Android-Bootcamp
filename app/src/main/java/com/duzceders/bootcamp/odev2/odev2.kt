package com.duzceders.bootcamp.odev2


fun dereceToFahrenheit(derece: Double): Double {
    return derece * 1.8 + 32
}


fun dikdortgenCevresi(kenar1: Int, kenar2: Int): Int {
    return 2 * (kenar1 + kenar2)
}


fun faktoriyel(sayi: Int): Int {
    var sonuc = 1
    for (i in 1..sayi) {
        sonuc *= i
    }
    return sonuc
}


fun aHarfiSayisi(kelime: String): Int {
    return kelime.count { it == 'a' || it == 'A' }
}

fun icAcilarToplami(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180
}

fun maasHesapla(gunSayisi: Int): Int {
    val saatlikUcret = 10
    val mesaiSaatlikUcret = 20
    val toplamSaat = gunSayisi * 8

    return if (toplamSaat <= 160) {
        toplamSaat * saatlikUcret
    } else {
        (160 * saatlikUcret) + ((toplamSaat - 160) * mesaiSaatlikUcret)
    }
}

fun kotaUcretiHesapla(kotaGb: Int): Int {
    return if (kotaGb <= 50) {
        100
    } else {
        100 + (kotaGb - 50) * 4
    }
}
