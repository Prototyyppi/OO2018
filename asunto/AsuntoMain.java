import java.io.*;
import java.util.Scanner;

/*
Muokkaa 2. viikkotehtävän luokkarakennetta: tontti – rakennus – asukas. Tontilla on
nimi, osoite ja pinta-ala. Tontilla on enintään yksi rakennus. Rakennus voi olla kerrostalo,
rivitalo, tai omakotitalo. Rakennuksesta tunnetaan sen asuntojen määrä, kunkin asunnon
pinta-ala ja huoneiden lukumaara ja asuntojen asukkaat. Asukkaasta talletetaan nimi, joka
voi olla merkkijono. Suunnittele luokkien väliset suhteet! Luokkiin on toteutettava
sopivat muodostimet sekä jäsenten asetus- ja saantimetodit. Näiden lisäksi luokkiin on
toteutettava tulostusmetodit. Käytä ohjelman toteutuksessa taulukoiden sijasta Javan
valmiita kokoelmaluokkia
*/
class AsuntoMain {
	static Scanner lukija = new Scanner(System.in);
	public static void main(String[] args) throws CustomException
	{
		//try {
			Tontti tontti = makeTontti();
			System.out.println(tontti.toString());
			System.out.println(tontti.rakennusToString());
			for (int i = 0; i < tontti.getAsukasLkm(); i++)
				System.out.println(tontti.getAsukasInfo(i));
		/*} catch (Exception CustomException) {
			return;
		}
		*/
	}

	public static Tontti makeTontti() throws CustomException
	{
		String tontin_nimi, tontin_osoite;
		double tontin_ala, rakennuksen_ala;
		int huoneiden_lkm, asukkaiden_lkm, tyyppi;

		System.out.println("Anna tontin nimi: ");
		tontin_nimi = lukija.nextLine();

		System.out.println("Anna tontin osoite: ");
		tontin_osoite = lukija.nextLine();

		do {
		System.out.println("Anna tontin ala: ");
		tontin_ala = lukija.nextDouble();
		} while (negCheck(tontin_ala) != 0);

		do {
		System.out.println("Anna rakennuksen ala: ");
		rakennuksen_ala = lukija.nextDouble();
		} while (negCheck(rakennuksen_ala) != 0);

		if(rakennuksen_ala > tontin_ala)
			throw new CustomException("Tontin täytyy olla suurempi tai yhtäsuuri kuin rakennuksen");

		do {
		System.out.println("Anna huoneiden lkm: ");
		huoneiden_lkm = lukija.nextInt();
		} while(negCheck(huoneiden_lkm) != 0);

		do {
			System.out.println("Anna talon tyyppi: ");
			System.out.println("Omakotitalo: 2");
			System.out.println("Rivitalo: 1");
			System.out.println("Kerrostalo: 0");
			System.out.println("Anna: ");
			tyyppi = lukija.nextInt();
		} while(tyyppi < 0 || tyyppi > 2);
	
		do {
		System.out.println("Anna asukkaiden lkm (väh 1 kpl): ");
		asukkaiden_lkm = lukija.nextInt();
		lukija.nextLine();
		} while ((negCheck(asukkaiden_lkm) != 0) || (asukkaiden_lkm < 1));

		Tontti tontti = new Tontti(tontin_nimi, tontin_osoite, tontin_ala, rakennuksen_ala,
															huoneiden_lkm, asukkaiden_lkm, tyyppi);
		int i;
		int ok = 0;
		for (i = 0; i < asukkaiden_lkm; i++) {
			System.out.println("Asukkaan " + (i+1) + " nimi: ");
			String asukkaan_nimi = lukija.nextLine();
			System.out.println("Asukkaan " + (i+1) + " syntymäaika: ");
			String asukkaan_synt = lukija.nextLine();
			ok = tontti.setAsukas(asukkaan_nimi, asukkaan_synt);
			if (ok == 1)
				break;
		}
		return tontti;
	
}

	public static int negCheck(double value) {

		if (value < 0) {
			System.out.println("Anna positiivinen luku.");
			return -1;
		}
		return 0;
	}



}
