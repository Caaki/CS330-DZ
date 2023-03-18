package com.example.cs330_dz04

data class Predmet( var sifra:String,
                    var naziv:String,
                    var espb: Int,
                    var semestar: Int,
                    var obavezan: Boolean) {

    override fun toString(): String {
        return "$sifra-$naziv ESP: $espb semestar:$semestar ${if (this.obavezan) "(obavezan)" else "(izborni)"}"
    }

    override fun equals(other: Any?): Boolean {
        return this.sifra.equals((other as Predmet).sifra)
    }
}