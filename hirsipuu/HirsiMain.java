import java.io.*;
import java.util.Scanner;

class HirsiMain {
	static Scanner lukija = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException {
	Hirsipuu hirsi;
	Sanalista lista;
	lista = InitSanalista( );
	//lista = lista.sanaJoissaMerkit("_____");
	//lista = lista.sanatJoidenPituusOn(5);
	hirsi = InitHirsipuu(lista);

	PlayHirsipuu(hirsi);
	return;
	}

	public static Hirsipuu InitHirsipuu( Sanalista lista)
	{
		System.out.println("Anna arvausten lukumäärä : ");
		int arvaus_lkm = lukija.nextInt();
		return new Hirsipuu(lista, arvaus_lkm);
	}

	public static Sanalista InitSanalista( ) throws FileNotFoundException
	{
		System.out.println("Anna tiedoston nimi : ");
		String nimi = lukija.nextLine();
		return new Sanalista(nimi);
	}

	public static int PlayHirsipuu(Hirsipuu hirsi)
	{
		Character arvaus;
		while (hirsi.arvauksiaOnJaljella() > 0) {
			System.out.println(hirsi.toString());
			System.out.printf("Arvauksia jäljellä %d\n", hirsi.arvauksiaOnJaljella());
			System.out.printf("Arvauksesi: ");
			arvaus = lukija.next().charAt(0);
			if (hirsi.arvaa(arvaus))
				System.out.println("Löytyy kyllä");
			else
				System.out.println("Väärin");
			if (hirsi.onLoppu()) {
				System.out.println("Voitit pelin");
				System.out.println("Sana oli " + hirsi.sana());
				return 0;
			}
		}
		System.out.println("Hävisit pelin");
		System.out.println("Sana oli " + hirsi.sana());
		return 1;
	}

}
