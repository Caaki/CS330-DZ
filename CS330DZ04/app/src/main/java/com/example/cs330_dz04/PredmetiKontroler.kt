package com.example.cs330_dz04

class PredmetiKontroler(var sviPredmeti: MutableList<Predmet>): KontrolaStudenata {

    override fun registruj(s: Student, p: Predmet) {
        this.sviPredmeti.find { it.sifra ==p.sifra }?. let {
            var novaLista = s.listaPredmeta.toMutableList();
            if (!novaLista.contains(p)){
                novaLista.add(p);
                s.listaPredmeta = novaLista.toList();
                println("Student ${s.ime} ${s.prezime} je uspesno dodat predmet ${p.naziv}")
            }else{
                println("Student vec slusa dati predmet ${p.naziv}")
            }
        }?.run {
            println("Ne postoji odabrani predmet u listi predmeta!!!");
        }


    }

    override fun odjavi(s: Student, p: Predmet) {
        var novaLista = s.listaPredmeta.toMutableList();
        if (novaLista.contains(p)){
            novaLista.remove(p);
            s.listaPredmeta = novaLista.toList()
            println("Student ${s.ime} ${s.prezime} je uspesno odjavljen sa predmeta ${p.naziv}")
        }else{
            println("Student ne slusa predmet: ${p.naziv}")
        }
    }


}