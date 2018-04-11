import java.io.*;
import java.util.Scanner;
import java.lang.Integer;

public class VT4main {
	static Scanner lukija = new Scanner(System.in);
	public static void main(String [] args) {
		InsInfoContainer firstContainer = initWithFive();
		System.out.println("Anna raja-arvo");
		int threshold = lukija.nextInt();
		System.out.println("Objektit joiden vakuutusarvo on pienempi tai yhtäsuuri:");
		firstContainer.printInsValueLess(threshold);
		System.out.println("Objektit joiden vakuutusarvo on suurempi tai yhtäsuuri:");
		firstContainer.printInsValueMore(threshold);
		System.out.println("Kaikki arvot:");
		firstContainer.printVector();
	}
	public static InsInfoContainer initWithFive() {
		InsInfoContainer firstContainer = new InsInfoContainer();
		for (int i = 0; i<5; i++){
			System.out.println("Anna tyyppi");
			String tyyppi = lukija.nextLine();
			System.out.println("Anna sijainti");
			String sijainti = lukija.nextLine();
			Property prop = new Property(tyyppi, sijainti);
			System.out.println("Anna vakuutusarvo");
			double vakuutus = lukija.nextDouble();
			lukija.nextLine();
			InsuranceInfo ins = new InsuranceInfo(prop, vakuutus);
			firstContainer.addElem(ins);
		}
		return firstContainer;
	}
}
