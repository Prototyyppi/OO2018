import java.io.*;
import java.util.Scanner;

class HirsiMain {
	static Scanner lukija = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException
	{
	Hirsipuu hirsi;
	Sanalista lista;
	//try {
	lista = InitSanalista( );
	lista = lista.sanaJoissaMerkit("stat_c");
	
	hirsi = InitHirsipuu(lista);
	/*} catch(Exception e) {
		return;
	}*/
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
		while(hirsi.arvauksiaOnJaljella() > 0) {
			System.out.println(hirsi.toString());
			System.out.printf("Arvauksia jäljellä %d\n", hirsi.arvauksiaOnJaljella());
			System.out.printf("Arvauksesi: ");
			arvaus = lukija.next().charAt(0);
			if(hirsi.arvaa(arvaus))
				System.out.println("Löytyy kyllä");
			else
				System.out.println("Väärin");
			if (hirsi.onLoppu()) {
				System.out.println("Voitit pelin");
				return 2;
			}
		}
		System.out.println("Hävisit pelin");
		return 1;
	}



}
