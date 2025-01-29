package org.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopeeS31052Application implements CommandLineRunner {
	private final SklepService sklepService;

	public ShopeeS31052Application(SklepService sklepService) {
		this.sklepService = sklepService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ShopeeS31052Application.class, args);
	}

	@Override
	public void run(String... args) {
		Klient klient = new Klient(1, 150);
		Koszyk koszyk = new Koszyk(klient);

		koszyk.dodajProdukt("mleko");
		koszyk.dodajProdukt("mleko");
		koszyk.dodajProdukt("piwo");

		sklepService.finalizujZakup(koszyk);
	}
}