import java.io.*;
import java.util.Scanner;
import java.lang.Integer;
import java.util.regex.*;

public abstract class Subscription {
	private String lehden_nimi;
	private String tilaajan_nimi;
	private String toimitusosoite;
	protected double kuukausihinta;


	public Subscription(String lehden_nimi, String tilaaja, String osoite, double kuukausimaksu) {
		this.lehden_nimi = lehden_nimi;
		this.tilaajan_nimi = tilaaja;
		this.toimitusosoite = osoite;
		this.kuukausihinta = kuukausimaksu;
	}

	public String getName() {
		return lehden_nimi;
	}
	public String getTilaaja() {
		return tilaajan_nimi;
	}
	public String getToimitusosoite() {
		return toimitusosoite;
	}
	public double getKuukausihinta() {
		return kuukausihinta;
	}

	public String toString() {
		return "Lehden tiedot:\n" + "Lehden nimi: " + getName() +
				" \nTilaajan nimi: " + getTilaaja() + " \nToimitusosoite: " +
				getToimitusosoite() + String.format("\nKuukausimaksu: %.2f", getKuukausihinta());
	}

	public void setName(String name) {
		this.lehden_nimi = name;
	}
	public void setTilaaja(String name) {
		this.tilaajan_nimi = name;
	}
	public void setToimitusosoite(String osoite) {
		this.toimitusosoite = osoite;
	}
	public void setKuukausihinta(double hinta) {
		this.kuukausihinta = hinta;
	}

	public abstract String printInvoice();
	// Can have different functionality depending on inheritor
}