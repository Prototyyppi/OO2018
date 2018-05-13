import java.io.*;

public class Omakotitalo extends Rakennus {
	public Omakotitalo(double ala, int huoneet, int asukas_lkm) {
		super(ala, huoneet, asukas_lkm);
	}

	@Override
	public String toString() {
		return "\n\nRakennuksen tiedot:\n" + "On omakotitalo \n" + "Rakennuksen huoneet: " + getRooms() +
																" \nRakennuksen ala: " + getArea();
	}

}