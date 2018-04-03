import java.io.*;
import java.util.Scanner;
import java.lang.Integer;
import java.util.regex.*;

public class SubscriptionMain {
	static Scanner lukija = new Scanner(System.in);
	private static final boolean REGULAR = false;
	private static final boolean STANDING = true;

	public static void main(String [] args) {

		Subscription r_sub = init(REGULAR);
		print(r_sub);

		System.out.println();

		Subscription s_sub = init(STANDING);
		print(s_sub);
	}

	public static void print(Subscription sub) {
		System.out.println(sub.printInvoice());
	}

	public static Subscription init(boolean type) {

		int alennus = 0, kesto = 0;
		System.out.println("Anna lehden nimi");
		String nimi = lukija.nextLine();
		System.out.println("Tilaajan nimi");
		String tilaaja = lukija.nextLine();
		System.out.println("Osoite");
		String osoite = lukija.nextLine();
		System.out.println("kuukausimaksu");
		double kuukausimaksu = lukija.nextDouble();
		lukija.nextLine();

		if (type) {
			do {
				System.out.println("alennusprosentti");
				alennus = lukija.nextInt();
				lukija.nextLine();
			} while (!(alennus >= 0 && alennus <= 100));
		} else {
			System.out.println("kesto");
			kesto = lukija.nextInt();
			lukija.nextLine();
		}

		return
		type ?
		new StandingSubscription(nimi, tilaaja, osoite, kuukausimaksu, alennus):
		new RegularSubscription(nimi, tilaaja, osoite, kuukausimaksu, kesto);
}
}