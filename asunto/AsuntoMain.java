package asunto;
import java.io.*;
import java.util.Scanner;
import java.lang.Integer;

class AsuntoMain {
	static Scanner lukija = new Scanner(System.in);
	public static void main(String[] args)
	{
		Tontti tontti = makeTontti();

		System.out.println(tontti.toString());
	}

	public static Tontti makeTontti()
	{
	System.out.println("Anna tontin nimi: ");
    String tontin_nimi = lukija.nextLine();
    System.out.println("Anna longituudi: ");
    String longituudi = lukija.nextLine();
    System.out.println("Anna latituudi: ");
    String latituudi = lukija.nextLine();
    System.out.println("Anna tontin ala: ");
    double tontin_ala = lukija.nextDouble();
    System.out.println("Anna rakennuksen ala: ");
    double rakennuksen_ala = lukija.nextDouble();
    System.out.println("Anna huoneiden lkm: ");
    int huoneiden_lkm = lukija.nextInt();
    System.out.println("Anna asukkaiden lkm: ");
    int asukkaiden_lkm = lukija.nextInt();
	lukija.nextLine();
	Tontti tontti = new Tontti(tontin_nimi, longituudi, latituudi, tontin_ala, rakennuksen_ala,
														huoneiden_lkm, asukkaiden_lkm);
	int i;
	int ok = 0;
    for (i = 0; i < 10; i++) {
		if (ok == 1)
			break;
        System.out.println("Asukkaan " + i + " nimi: ");
        String asukkaan_nimi = lukija.nextLine();
        System.out.println("Asukkaan " + i + " syntymäaika: ");
        String asukkaan_synt = lukija.nextLine();
		ok = tontti.setAsukas(asukkaan_nimi, asukkaan_synt);
	}
		return tontti;
	
}

}
