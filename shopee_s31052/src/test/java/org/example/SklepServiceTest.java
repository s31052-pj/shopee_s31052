package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SklepServiceTest {
    private SklepService sklepService;
    private Klient klient;
    private Klient klient2;

    @BeforeEach
    void setup() {
        sklepService = new SklepService();
        klient = new Klient(1, 150);
        klient2 = new Klient(2, 50);
    }

    @Test
    void testFinalizacjaZakupu_Sukces() {
        Koszyk koszyk = new Koszyk(klient);
        koszyk.dodajProdukt("mleko");
        koszyk.dodajProdukt("mleko");
        koszyk.dodajProdukt("piwo");

        sklepService.finalizujZakup(koszyk);

        assertThat(klient.pobierzSaldo()).isEqualTo(130);
    }

    @Test
    void testFinalizacjaZakupu_BrakSrodkow() {
        Koszyk koszyk = new Koszyk(klient2);
        koszyk.dodajProdukt("piwo");
        koszyk.dodajProdukt("piwo");
        koszyk.dodajProdukt("piwo");
        koszyk.dodajProdukt("piwo");
        koszyk.dodajProdukt("piwo");
        koszyk.dodajProdukt("piwo");
        koszyk.dodajProdukt("piwo");
        koszyk.dodajProdukt("piwo");

        sklepService.finalizujZakup(koszyk);

        assertThat(klient2.pobierzSaldo()).isEqualTo(50);
    }
}