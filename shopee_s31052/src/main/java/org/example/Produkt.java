package org.example;

public class Produkt {
    private final String nazwa;
    private final double cena;

    public Produkt(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public String pobierzNazwe() {
        return nazwa;
    }

    public double pobierzCene() {
        return cena;
    }
}