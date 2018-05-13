import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Integer;

public abstract class Rakennus {
	private double ala;
	private int huoneet;
	private int asukas_lkm;
	private ArrayList<Asukkaat> asukaspurkki = new ArrayList<Asukkaat>();
	private int currentPopulation;

	public Rakennus(double ala, int huoneet, int asukas_lkm) {
		this.ala = ala;
		this.huoneet = huoneet;
		this.asukas_lkm = asukas_lkm;
		currentPopulation = 0;
	}
	public double getArea() {
		return ala;
	}
	public int getRooms() {
		return huoneet;
	}
	public int getPeople() {
		return asukas_lkm;
	}
	public void setArea(double area) {
		this.ala = area;
	}
	public void setRooms(int rooms) {
		this.huoneet = rooms;
	}
	public void setPeople(int people) {
		asukas_lkm = people;
	}
	public String toString() {
		return "\n\nRakennuksen tiedot:\n" + "Rakennuksen huoneet: " + getRooms() +
																" \nRakennuksen ala: " + getArea();
	}
	public int setAsukas(String name, String birthDay) {
		int ok = 1;
		if (currentPopulation < asukas_lkm) {
			asukaspurkki.add(new Asukkaat(name, birthDay));
			asukaspurkki.trimToSize();
			currentPopulation++;
			ok = 0;
		}
		return ok;
	}

	public String getAsukasInfo(int i) {
		Asukkaat asukas = asukaspurkki.get(i);
		return "\n\nAsukkaan " + (i+1) +" tiedot:\n" + asukas.toString();
	}
	public int getAsukasLkm() {
		return asukaspurkki.size();
	}
}