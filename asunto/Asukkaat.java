package asunto;
import java.io.*;
import java.util.Scanner;
import java.lang.Integer;

public class Asukkaat {
	private String name;
	private String birthdate;
	private Rakennus rakki;
	static Scanner lukija = new Scanner(System.in);
	static int as_lkm;

	public Asukkaat(int i, String asukkaan_nimi, String asukkaan_synt, Rakennus rak) {
		rakki = rak;
		setName(asukkaan_nimi);
		setBirthdate(asukkaan_synt);
		as_lkm++;
	}
	public void printInfo() {
		System.out.println("Asukkaan tiedot:");
		System.out.println("Asukkaan nimi: " + getName());
		System.out.println("Asukkaan syntymäaika: " + getBirthdate());
		System.out.println("Asukkaan talon tiedot:");
		rakki.printInfo();
	}
	public String getName() {
		return name;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
}
