package pankkitili;
import java.io.*;
import java.util.Scanner;
import java.lang.Integer;
/* Version2 */

class PankkitiliMain2 {
	static Scanner lukija = new Scanner(System.in);
	public static void main(String[] args)
	{

		Pankkitili tili = readTili();
		printTili(tili);
		for (int i=0; i<3; i++) { //lets try 3 times
		System.out.print("Paljonko nostetaan >");
		double summa = lukija.nextDouble();
		lukija.nextLine();
		tili.nostaRahaa(summa);
		}
		printTili(tili);
}

public static Pankkitili readTili() {
	String account;
	String person;
	double saldo;

	System.out.print("Anna tilinumero >");
	account = lukija.nextLine();

	System.out.print("Anna tilin omistajan nimi >");
	person = lukija.nextLine();

	do {
		System.out.print("Anna tilin: " + account + " saldo >");
		saldo = lukija.nextDouble();
		lukija.nextLine();
		if (saldo < 0) {
			System.out.println("Negative number not accepted");
		}
	} while (saldo < 0);

	Pankkitili tili = new Pankkitili(account, person, saldo);
	return tili;

}

	public static void printTili(final Pankkitili t){
		System.out.println(t.toString());
}

}
