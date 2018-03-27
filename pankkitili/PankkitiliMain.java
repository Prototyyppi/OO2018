package pankkitili;
import java.io.*;
import java.util.Scanner;
import java.lang.Integer;

class PankkitiliMain {
	static Scanner lukija = new Scanner(System.in);
	public static void main(String[] args)
	{
		/*
		 * nextDouble does not read nextline character and leaves it
		 * to be read by nextLine.
		 */
		int size;
		do {
			System.out.print("Anna tilien lukumaara >");
			size = lukija.nextInt();
			lukija.nextLine();
		} while( size < 1 );
		System.out.println("");

		Pankkitili [] tilit = new Pankkitili[size];
		readTilit(tilit);
		printTilit(tilit);
		massRemoveMoney(tilit);
		printTilit(tilit);
}

public static Pankkitili readTili(){
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

public static void readTilit( Pankkitili [] tilit ) {
	for(int i=0; i < tilit.length; i++){
		tilit[i] = readTili();
	}
}

public static void printTilit( Pankkitili [] tilit ) {
	System.out.println("\nTilitaulukon sisalto:");
	for (Pankkitili t : tilit)
		printTili( t );
}

public static void massRemoveMoney( Pankkitili [] tilit ) {
	System.out.println("\nPoistan kaikilta 300:");
	for (Pankkitili t : tilit)
		t.nostaRahaa( 300 );
}

	public static void printTili(final Pankkitili t){
		System.out.println(t.toString());
}

}
