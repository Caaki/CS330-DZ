package com.example.cs330_dz04

data class Student( var index:Int,
                    var ime:String,
                    var prezime: String,
                    var listaPredmeta:List<Predmet>) {

    override fun toString(): String {
        return "$index $ime $prezime"
    }

}