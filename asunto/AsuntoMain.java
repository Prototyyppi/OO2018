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
		String tontin_nimi, longituudi, latituudi;
		double tontin_ala, rakennuksen_ala;
		int huoneiden_lkm, asukkaiden_lkm;
		System.out.println("Anna tontin nimi: ");
		tontin_nimi = lukija.nextLine();
		do {

		System.out.println("Anna latituudi: ");
		latituudi = lukija.nextLine();

		System.out.println("Anna longituudi: ");
		longituudi = lukija.nextLine();

		} while (checkGPS(latituudi, longituudi) != 0);

		do {
		System.out.println("Anna tontin ala: ");
		tontin_ala = lukija.nextDouble();
		} while (negCheck(tontin_ala) != 0);

		do {
		System.out.println("Anna rakennuksen ala: ");
		rakennuksen_ala = lukija.nextDouble();
		} while (negCheck(rakennuksen_ala) != 0);

		do {
		System.out.println("Anna huoneiden lkm: ");
		huoneiden_lkm = lukija.nextInt();
		} while(negCheck(huoneiden_lkm) != 0);

		do {
		System.out.println("Anna asukkaiden lkm: ");
		asukkaiden_lkm = lukija.nextInt();
		lukija.nextLine();
		} while (negCheck(asukkaiden_lkm) != 0);

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
public static int checkGPS(String latituudi, String longituudi)
{

	//Sanity check for latitude and longitude
	String latitude_pattern = "(\\d{2}\\.\\d{3}N|S|n|s$)";
	String longitude_pattern = "(\\d{2}\\.\\d{3}E|e|W|w$)";

	Pattern lon = Pattern.compile(longitude_pattern);
	Pattern lat = Pattern.compile(latitude_pattern);

	Matcher lon_match = lon.matcher(longituudi);
	Matcher lat_match = lat.matcher(latituudi);
	// See if both matched
	if (!(lon_match.find() && lat_match.find())){
		System.out.println("Yritä uudelleen ");
		return -1;
	}
	return 0;
}

	public static int negCheck(double value) throws IllegalArgumentException {

		if (value < 0) {
			System.out.println("Negative value NOT allowed.");
			return -1;
		}
		return 0;

	}



}
