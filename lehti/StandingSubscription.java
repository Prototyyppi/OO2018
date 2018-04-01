import java.io.*;
import java.util.Scanner;
import java.lang.Integer;
import java.util.regex.*;

public class StandingSubscription extends Subscription {

	private int tilauksen_kesto;
	private int alennusprosentti;

	public StandingSubscription(String lehden_nimi, String tilaaja, String osoite, double kuukausimaksu) {
		super(lehden_nimi, tilaaja, osoite, kuukausimaksu);
	}

	public int getKesto() {
		return tilauksen_kesto;
	}
	public int getAlennus() {
		return alennusprosentti;
	}

	public String toString() {
		return "\nTilauksen on kertatilaus";
	}

	public void setKesto(int kesto) {
		this.tilauksen_kesto = kesto;
	}
	public void setAlennus(int alennus) {
		this.alennusprosentti = alennus;
	}

	public String printInvoice() {
		return super.toString() + this.toString();
	}

}
