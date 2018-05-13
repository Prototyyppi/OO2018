import java.io.*;
import java.util.Scanner;
import java.lang.Integer;

public class Rivitalo extends Rakennus {

	public Rivitalo(double ala, int huoneet, int asukas_lkm) {
		super(ala, huoneet, asukas_lkm);
	}

	@Override
	public String toString() {
		return "\n\nRakennuksen tiedot:\n" + "On rivitalo \n" + "Rakennuksen huoneet: " + getRooms() +
																" \nRakennuksen ala: " + getArea();
	}

}