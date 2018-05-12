import java.io.*;

public class InsuranceInfo {

	private Property kiinteisto;
	private double vakuutusArvo;

	public InsuranceInfo(Property kiinteisto, double vakuutusArvo) {
		this.kiinteisto = kiinteisto;
		this.vakuutusArvo = vakuutusArvo;
	}

	public double getInsValue() {
		return vakuutusArvo;
	}

	public void setInsValue(double vak_arvo) {
		vakuutusArvo = vak_arvo;
	}

	public String toString() {
		return "Kiinteistö: | Sijainti: " + kiinteisto.getSijainti() + " | Tyyppi: " + kiinteisto.getTyyppi() + " | Vakuutusarvo: " + this.vakuutusArvo;
	}

}
