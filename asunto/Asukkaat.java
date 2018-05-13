import java.io.*;

public class Asukkaat {
	private String name;
	private String birthDate;

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
