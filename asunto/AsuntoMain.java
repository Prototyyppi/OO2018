package asunto;
import java.io.*;
import java.util.Scanner;
import java.lang.Integer;
import java.util.regex.*;
class AsuntoMain {
	static Scanner lukija = new Scanner(System.in);
	public static void main(String[] args)
	{
		Tontti tontti = makeTontti();

		System.out.println(tontti.toString());
		for (int i = 0; i < tontti.getAsukasLkm(); i++)
			System.out.println(tontti.getAsukas(i));
	}

	public static Tontti makeTontti()
	{
		System.out.println("Anna tontin nimi: ");
		String tontin_nimi = lukija.nextLine();

		System.out.println("Anna longituudi: ");
		String longituudi = lukija.nextLine();

		System.out.println("Anna latituudi: ");
		String latituudi = lukija.nextLine();

		checkGPS(latituudi, longituudi);

		System.out.println("Anna tontin ala: ");
		double tontin_ala = lukija.nextDouble();
		negCheck(tontin_ala);
		System.out.println("Anna rakennuksen ala: ");
		double rakennuksen_ala = lukija.nextDouble();
		negCheck(rakennuksen_ala);
		System.out.println("Anna huoneiden lkm: ");
		int huoneiden_lkm = lukija.nextInt();
		negCheck(huoneiden_lkm);
		System.out.println("Anna asukkaiden lkm: ");
		int asukkaiden_lkm = lukija.nextInt();
		negCheck(asukkaiden_lkm);
		lukija.nextLine();
		Tontti tontti = new Tontti(tontin_nimi, longituudi, latituudi, tontin_ala, rakennuksen_ala,
																	huoneiden_lkm, asukkaiden_lkm);
		int i;
		int ok = 0;
		for (i = 0; i < asukkaiden_lkm; i++) {
			if (ok == 1)
				break;
			System.out.println("Asukkaan " + (i+1) + " nimi: ");
			String asukkaan_nimi = lukija.nextLine();
			System.out.println("Asukkaan " + (i+1) + " syntymäaika: ");
			String asukkaan_synt = lukija.nextLine();
			ok = tontti.setAsukas(asukkaan_nimi, asukkaan_synt);
		}
		return tontti;
	
}
public static void checkGPS(String latituudi, String longituudi) throws IllegalArgumentException
{

	//Sanity check for latitude and longitude
	String longitude_pattern = "(\\d{2}\\.\\d{3}N|S|n|s$)";
	String latitude_pattern = "(\\d{2}\\.\\d{3}E|e|W|w$)";

	Pattern lon = Pattern.compile(longitude_pattern);
	Pattern lat = Pattern.compile(latitude_pattern);

	Matcher lon_match = lon.matcher(longituudi);
	Matcher lat_match = lat.matcher(latituudi);
	// See if both matched
	if (!(lon_match.find() && lat_match.find())){
		throw new IllegalArgumentException("GPS value problem. Exiting...");
	}
}
	public static void negCheck(double value) throws IllegalArgumentException {

		if (value < 0) {
			throw new IllegalArgumentException("Negative value NOT allowed. Exiting...");
		}

	}



}
