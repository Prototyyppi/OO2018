package asunto;
import java.io.*;
import java.util.Scanner;
import java.lang.Integer;

public class Asukkaat {
	private String name;
	private String birthDate;
	static Scanner lukija = new Scanner(System.in);

	public Asukkaat(String name, String birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}

	public String toString() {
		return "Asukkaan nimi: " + getName() + "\nAsukkaan syntymäaika: " + getBirthdate();
	}
	public String getName() {
		return name;
	}
	public String getBirthdate() {
		return birthDate;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBirthdate(String birthDate) {
		this.birthDate = birthDate;
	}
}
