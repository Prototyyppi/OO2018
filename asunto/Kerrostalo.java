import java.io.*;
import java.util.Scanner;
import java.lang.Integer;

public class Kerrostalo extends Rakennus {

	public Kerrostalo(double ala, int huoneet, int asukas_lkm) {
		super(ala, huoneet, asukas_lkm);
	}

	@Override
	public String toString() {
		return "\n\nRakennuksen tiedot:\n" + "On kerrostalo \n" + "Rakennuksen huoneet: " + getRooms() +
																" \nRakennuksen ala: " + getArea();
	}

}