import java.io.*;
import java.util.Scanner;
import java.lang.Integer;
import java.util.regex.*;

public class StandingSubscription extends Subscription {

	private int alennusprosentti;

	public StandingSubscription(String lehden_nimi, String tilaaja, String osoite, double kuukausimaksu, int alennus) {
		super(lehden_nimi, tilaaja, osoite, kuukausimaksu);
		alennusprosentti = alennus;
		modifyMaksu();
	}

	public int getAlennus() {
		return alennusprosentti;
	}

	public void modifyMaksu() {
		kuukausihinta *= (1 - (alennusprosentti / 100.0));
	}

	public double getMaksu() {
		return kuukausihinta * 12;
	}

	public String toString() {
		return " \nAlennusprosentti: " + getAlennus() + " \nVuosimaksu: " + getMaksu();
	}

	public void setAlennus(int alennus) {
		this.alennusprosentti = alennus;
	}

	public String printInvoice() {
		return super.toString() + this.toString();
	}

}
