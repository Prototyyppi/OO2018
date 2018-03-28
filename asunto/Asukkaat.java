package asunto;
import java.io.*;
import java.util.Scanner;
import java.lang.Integer;

public class Asukkaat {
	private String name;
	private String birthdate;
	static Scanner lukija = new Scanner(System.in);
	static int as_lkm;

	public Asukkaat(int i) {
		System.out.println("Asukkaan " + i + " nimi: ");
		setName(lukija.nextLine());
		System.out.println("Asukkaan " + i + " syntymäaika: ");
		setBirthdate(lukija.nextLine());
		as_lkm++;
	}
	public void printInfo() {
		System.out.println("Asukkaan nimi: " + getName());
		System.out.println("Asukkaan syntymäaika: " + getBirthdate());
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
