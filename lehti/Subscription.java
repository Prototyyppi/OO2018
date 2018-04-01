import java.io.*;
import java.util.Scanner;
import java.lang.Integer;
import java.util.regex.*;

public abstract class Subscription {
	private String lehden_nimi;
	private String tilaajan_nimi;
	private String toimitusosoite;
	private double kuukausihinta;


	public Subscription() {

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
		return "Lehden tiedot:\n" + "TLehden nimi: " + getName() +
				" \nTilaajan nimi: " + getTilaaja()+ " \nToimitusosoite: " +
				getToimitusosoite()+ " \nKuukausimaksu: " + getKuukausihinta() + getKuukausihinta();
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

	public abstract void printInvoice();
	// different functionality depending on inheritor
}