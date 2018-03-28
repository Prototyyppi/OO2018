package asunto;
import java.io.*;
import java.util.Scanner;
import java.lang.Integer;

public class Rakennus {
	private double area;
	private int room_count;
	private int dwellers;
	private Asukkaat [] asukkaat;

	public Rakennus(double area, int room_count, int dwellers) {
		this.area = area;
		this.room_count = room_count;
		this.dwellers = dwellers;
		Asukkaat[] asukas = new Asukkaat[dwellers];
		asukkaat = asukas;

		/*for (i = 0; i < asukas.length; i++) {
			asukas[i] = new Asukkaat(i+1);
		}*/
	}
	public String toString() {
		return "\n\nRakennuksen tiedot:\n" + "Rakennuksen nimi: " + getName() +
												getLongitude() + " \nRakennuksen ala: " + getArea();
	}
	public void setAsukas(String name, int number, String birthDay) {
		asukkaat[number] = new Asukkaat(name, birthDay);
	}
}