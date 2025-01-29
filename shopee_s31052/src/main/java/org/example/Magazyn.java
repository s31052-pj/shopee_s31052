package org.example;

import java.util.HashMap;
import java.util.Map;

public class Magazyn {
    private final Map<String, Produkt> produkty;

    public Magazyn() {
        produkty = new HashMap<>();
        produkty.put("mleko", new Produkt("mleko", 5.0));
        produkty.put("piwo", new Produkt("piwo", 10.0));
    }

    public Produkt pobierzProdukt(String nazwa) {
        return produkty.get(nazwa);
    }
}