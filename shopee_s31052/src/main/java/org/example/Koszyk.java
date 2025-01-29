package org.example;

import java.util.ArrayList;
import java.util.List;

public class Koszyk {
    private final Klient klient;
    private final List<String> produkty;

    public Koszyk(Klient klient) {
        this.klient = klient;
        this.produkty = new ArrayList<>();
    }

    public void dodajProdukt(String nazwa) {
        produkty.add(nazwa);
        System.out.println("Dodano do koszyka: " + nazwa);
    }

    public Klient pobierzKlienta() {
        return klient;
    }

    public List<String> pobierzProdukty() {
        return produkty;
    }
}