package pankkitili;
import java.io.*;

class Pankkitili {

	private String tilinumero;
	private String tilinomistaja;
	private double saldo;

	public Pankkitili(String tilinumero, String tilinomistaja, double saldo) {
		this.saldo = saldo;
		this.tilinomistaja = tilinomistaja;
		this.tilinumero = tilinumero;
	}

	/* Getters */
	public String getTilinumero() {
		return tilinumero;
	}
	public double getSaldo() {
		return saldo;
	}
	public String getTilinomistaja() {
		return tilinomistaja;
	}

	/* Setters */
	public void setTilinumero(String tilinumero) {
		this.tilinumero = tilinumero;
	}
	public void setTilinomistaja(String tilinomistaja_param) {
		tilinomistaja = tilinomistaja_param;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void talletaRahaa(double amount) {
		if (amount > 0){
			saldo += amount;
			System.out.println("OK," + tilinomistaja + " Saldosi: " + saldo);
		}
		else
			System.out.println(tilinomistaja + ", Negative number not accepted.");
	}
	public void nostaRahaa(double amount) {
		if ((saldo > amount) && amount > 0) {
			saldo -= amount;
			System.out.println("OK " + tilinomistaja + ". Saldosi: " + saldo);
		}
		else
		System.out.println(tilinomistaja + ", I Can not perform this action.");
	}
	public String toString() {
		return "Tilinomistaja: " + this.tilinomistaja + " Saldo: " + this.saldo + " Tilinumero: " + this.tilinumero;
	}


}