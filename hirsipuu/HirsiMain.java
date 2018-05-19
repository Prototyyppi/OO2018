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
class HirsiMain {
	static Scanner lukija = new Scanner(System.in);

	public static void main(String[] args) throws CustomException
	{
	Sanalista lista = InitSanalista( );
	Hirsipuu hirsi = InitHirsipuu(lista);
	Playhirsipuu(hirsi);
	}

	public static Hirsipuu InitHirsipuu( Sanalista lista)
	{
		System.out.println("Anna arvausten lukumäärä : ");
		int arvaus_lkm = lukija.nextInt();
		return new Hirsipuu(lista, arvaus_lkm);
	}

	public static Sanalista InitSanalista( )
	{
		System.out.println("Anna tiedoston nimi : ");
		String nimi = lukija.nextLine();
		return new Sanalista(nimi);
	}

	public static void PlayHirsipuu(Hirsipuu hirsi)
	{
		Character arvaus;
		boolean status;
		while(hirsi.arvauksiaOnJaljella() > 0) {
			System.out.println(hirsi.toString());
			System.out.printf("Arvauksia jäljellä %d", hirsi.arvauksiaOnJaljella());
			System.out.printf("Arvauksesi: ");
			arvaus = lukija.nextLine().charAt(0);
			if(hirsi.arvaa(arvaus))
				System.out.println("Löytyy kyllä");
			else
				System.out.println("Väärin");
		}
	}



}
