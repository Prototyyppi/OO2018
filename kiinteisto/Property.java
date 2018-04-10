import java.io.*;
import java.util.Scanner;
import java.lang.Integer;
import java.util.regex.*;

public class Property {
	private String tyyppi;
	private String sijainti;

	public Property(String tyyppi, String sijainti) {
		this.tyyppi = tyyppi;
		this.sijainti = sijainti;
	}

	public String getTyyppi() {
		return tyyppi;
	}
	public String getSijainti() {
		return sijainti;
	}

	public String toString() {
		return "Paikan tiedot:\n" + this.tyyppi +
				" \nSijainti: " + this.sijainti;
	}

	public void setTyyppi(String tyyppi) {
		this.tyyppi = tyyppi;
	}
	public void setSijainti(String sijainti) {
		this.sijainti = sijainti;
	}

}