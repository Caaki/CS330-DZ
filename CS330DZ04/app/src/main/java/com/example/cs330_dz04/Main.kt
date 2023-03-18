package com.example.cs330_dz04

fun main() {

    var CS330 = Predmet("CS330","Mobilne Aplikacije",8,6,false);
    var IT255 = Predmet("IT255","Veb1",8,5,true);
    var IT355 = Predmet("IT355","Veb2",8,6,true);
    var SE201 = Predmet("SE201","Softversko",8,5,true);
    var CS450 = Predmet("CS450","Klaud",8,6,false);

    var kontroler = PredmetiKontroler(mutableListOf(CS330,IT255,IT355,CS450));

    var s1 = Student(1234,"Pera","Peric", listOf(CS330,IT355));

    kontroler.registruj(s1,SE201);
    kontroler.registruj(s1,IT255);
    kontroler.odjavi(s1,CS450);

    println(s1.listaPredmeta)




}