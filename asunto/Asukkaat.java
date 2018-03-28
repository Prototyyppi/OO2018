package asunto;
import java.io.*;
import java.util.Scanner;
import java.lang.Integer;

public class Asukkaat {
	private String name;
	private String birthDate;
	static Scanner lukija = new Scanner(System.in);
	static int as_lkm;

	public Asukkaat(String name, String birthDate) {
		this.name = name;
		this.birthDate = birthDate;
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
		return birthDate;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBirthdate(String birthDate) {
		this.birthDate = birthDate;
	}
}
