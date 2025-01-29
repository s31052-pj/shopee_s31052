package org.example;

import org.springframework.stereotype.Service;

@Service
public class SklepService {
    private final Magazyn magazyn;

    public SklepService() {
        this.magazyn = new Magazyn();
    }

    public void finalizujZakup(Koszyk koszyk) {
        double suma = 0;
        for (String nazwaProduktu : koszyk.pobierzProdukty()) {
            Produkt produkt = magazyn.pobierzProdukt(nazwaProduktu);
            if (produkt != null) {
                suma += produkt.pobierzCene();
            }
        }

        Klient klient = koszyk.pobierzKlienta();
        if (klient.pobierzSaldo() >= suma) {
            klient.zmniejszSaldo(suma);
            System.out.println("Zamówienie zrealizowane! Nowe saldo: " + klient.pobierzSaldo());
        } else {
            System.out.println("Brak wystarczających środków na koncie!");
        }
    }
}