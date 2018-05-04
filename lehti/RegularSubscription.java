import java.io.*;
import java.util.Scanner;
import java.lang.Integer;
import java.util.regex.*;

public class RegularSubscription extends Subscription {

	private int tilauksen_kesto;

	public RegularSubscription(String lehden_nimi, String tilaaja, String osoite,
																double kuukausimaksu, int kesto) {
		super(lehden_nimi, tilaaja, osoite, kuukausimaksu);
		this.tilauksen_kesto = kesto;

	}

	public int getKesto() {
		return tilauksen_kesto;
	}

	public String toString() {
		return "\nTilaus on määräaikainen" + "\nTilauksen kesto (kk): " + getKesto() +
										"\nTilauksen hinta: " + (getKesto() * getKuukausihinta());
	}

	public void setKesto(int kesto) {
		this.tilauksen_kesto = kesto;
	}

	public String printInvoice() {
		return super.toString() + this.toString();
	}
}