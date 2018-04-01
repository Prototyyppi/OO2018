import java.io.*;
import java.util.Scanner;
import java.lang.Integer;
import java.util.regex.*;

public class SubscriptionMain {
	static Scanner lukija = new Scanner(System.in);

	public static void main(String [] args) {
		Subscription sub = init();
		print(sub);

	}

	public static void print(Subscription sub) {
		System.out.println(sub.printInvoice());
	}

	public static Subscription init() {
		System.out.println("Anna lehden nimi");
		String nimi = lukija.nextLine();
		System.out.println("Tilaajan nimi");
		String tilaaja = lukija.nextLine();
		System.out.println("Osoite");
		String osoite = lukija.nextLine();
		System.out.println("kuukausimaksu");
		double kuukausimaksu = lukija.nextDouble();
		lukija.nextLine();
		int kesto = 5;
		int alennus = 20;
		Subscription sub = new RegularSubscription(nimi, tilaaja, osoite, kuukausimaksu, kesto, alennus);
		return sub;
	}
}