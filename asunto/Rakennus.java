package asunto;
import java.io.*;
import java.util.Scanner;
import java.lang.Integer;

public class Rakennus {
	private double area;
	private int room_count;
	private int dwellers;
	private Asukkaat [] asukkaat;
	private int currentPopulation;

	public Rakennus(double area, int room_count, int dwellers) {
		this.area = area;
		this.room_count = room_count;
		this.dwellers = dwellers;
		Asukkaat[] asukas = new Asukkaat[dwellers];
		this.asukkaat = asukas;
		currentPopulation = 0;
		/*for (i = 0; i < asukas.length; i++) {
			asukas[i] = new Asukkaat(i+1);
		}*/
	}
	public double getArea() {
		return area;
	}
	public int getRooms() {
		return room_count;
	}
	public int getPeople() {
		return dwellers;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setRooms(int rooms) {
		this.room_count = rooms;
	}
	public void setPeople(int people) {
		dwellers = people;
	}
	public String toString() {
		return "\n\nRakennuksen tiedot:\n" + "Rakennuksen huoneet: " + getRooms() + " \nRakennuksen ala: " + getArea();
	}
	public int setAsukas(String name, String birthDay) {
		int ok = 1;
		if (currentPopulation < dwellers) {
			asukkaat[currentPopulation] = new Asukkaat(name, birthDay);
			currentPopulation++;
			ok = 0;
		}
		else
			System.out.println("No WAY! ");
		return ok;
	}
	public void removeAsukas(String name, String birthDay) {
		//TO be thought
		/*
		if (currentPopulation > 0) {
			asukkaat[number] = new Asukkaat(name, birthDay);
		}
		asukkaat[number] = new Asukkaat(name, birthDay);
		*/
	}
	public String getAsukas(int i) {
		return asukkaat[i].toString();
	}
}