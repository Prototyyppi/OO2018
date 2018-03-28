package asunto;
import java.io.*;
import java.util.Scanner;
import java.lang.Integer;

class AsuntoMain {
    static Scanner lukija = new Scanner(System.in);

	public static void main(String[] args)
	{
    System.out.println("Anna tontin nimi: ");
    String tontin_nimi = lukija.nextLine();
    System.out.println("Anna longituudi: ");
    String longituudi = lukija.nextLine();
    System.out.println("Anna latituudi: ");
    String latituudi = lukija.nextLine();
    System.out.println("Anna tontin ala: ");
    double tontin_ala = lukija.nextDouble();
    Tontti tontti = new Tontti(tontin_nimi, longituudi, latituudi, tontin_ala);
    System.out.println("Anna rakennuksen ala: ");
    double rakennuksen_ala = lukija.nextDouble();
    System.out.println("Anna huoneiden lkm: ");
    int huoneiden_lkm = lukija.nextInt();
    System.out.println("Anna asukkaiden lkm: ");
    int asukkaiden_lkm = lukija.nextInt();
    lukija.nextLine();
    Rakennus rakennus = new Rakennus(rakennuksen_ala, huoneiden_lkm, asukkaiden_lkm, tontti);
    Asukkaat[] asukas = new Asukkaat[asukkaiden_lkm];
    int i;
    for (i = 0; i < asukas.length; i++) {
        System.out.println("Asukkaan " + i + " nimi: ");
        String asukkaan_nimi = lukija.nextLine();
        System.out.println("Asukkaan " + i + " syntymäaika: ");
        String asukkaan_synt = lukija.nextLine();
        asukas[i] = new Asukkaat(i, asukkaan_nimi, asukkaan_synt, rakennus);
        
    }

    System.out.println("Asukkaita on: " + asukkaiden_lkm + " valitse");
    int valinta = lukija.nextInt();
    lukija.nextLine();
    asukas[valinta-1].printInfo();

    }

}