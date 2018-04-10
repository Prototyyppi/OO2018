import java.io.*;
import java.util.Scanner;
import java.lang.Integer;
import java.util.regex.*;

public class InsuranceInfo {

	private Property kiinteisto;
	private double vakuutusArvo;

	public InsuranceInfo(Property kiinteisto, double vakuutusArvo) {
		this.kiinteisto = kiinteisto;
		this.vakuutusArvo = vakuutusArvo;
	}

	public double getInsValue(){
		return vakuutusArvo;
	}

	public String toString() {
		return "Kiinteistö: | Sijainti: " + kiinteisto.getSijainti() + " | Tyyppi: " + kiinteisto.getTyyppi() + " | Vakuutusarvo: " + this.vakuutusArvo + "\n";
	}



}
