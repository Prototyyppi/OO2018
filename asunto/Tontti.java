import java.io.*;

public class Tontti {
	private String nimi;
	private String osoite;
	private double pinta_ala;
	private Rakennus rak;

	public Tontti(String nimi, String osoite, double pinta_ala, double rak_ala, int rak_huoneet, int rak_asukkaat, int tyyppi) {
		Rakennus rakennus;
		this.osoite = osoite;
		this.nimi = nimi;
		this.pinta_ala = pinta_ala;
		if (tyyppi == 0)
			rakennus = new Kerrostalo(rak_ala, rak_huoneet, rak_asukkaat);
		else if (tyyppi == 1)
			rakennus = new Rivitalo(rak_ala, rak_huoneet, rak_asukkaat);
		else
			rakennus = new Omakotitalo(rak_ala, rak_huoneet, rak_asukkaat);
		this.rak = rakennus;
	}

	public String getNimi() {
		return nimi;
	}
	public String getOsoite() {
		return osoite;
	}
	public double getPintaAla() {
		return pinta_ala;
	}

	public void setRakennus(Rakennus rakennus) {
		rak = rakennus;
	}
	public String toString() {
		return "Tontin tiedot:\n" + "Tontin nimi: " + getNimi() +
				" \nTontin osoite: " + getOsoite() + "\nTontin ala: " + getPintaAla();
	}
	public String rakennusToString() {
		return rak.toString();
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}
	public void setPintaAla(double ala) {
		this.pinta_ala = ala;
	}
	public int setAsukas(String name, String birthDay) {
		int ok;
		ok = rak.setAsukas(name, birthDay);
		return ok;
	}
	public String getAsukasInfo(int i) {
		return rak.getAsukasInfo(i);
	}
	public int getAsukasLkm() {
		return rak.getAsukasLkm();
	}
}