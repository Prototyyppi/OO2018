import java.io.*;
import java.util.*;
import java.lang.*;

public class Hirsipuu {

	private String sana;
	private StringBuilder sana_arvaus;
	private int arvaukset;
	private ArrayList<Character> arvauslista = new ArrayList<Character>();

	public Hirsipuu(Sanalista lista, int arvaukset) {
		Random rand = new Random(System.currentTimeMillis());
		if (lista.IsEmpty())
			throw new java.lang.Error("Was empty, nothing we can do");
		int n = rand.nextInt(lista.size());
		sana = lista.get(n);
		this.arvaukset = arvaukset;
		sana_arvaus = new StringBuilder(new String(new char[sana.length()]).replace('\0', '_'));
	}

	public boolean arvaa( Character merkki ) {
		boolean ret = false;
		merkki = Character.toUpperCase(merkki);
		arvauslista.add(merkki);
		//if (sana.indexOf(merkki) != -1)
		//	return true;
		for (int i = 0; i < sana.length(); i++) {
			if (sana.charAt(i) == merkki) {
				ret = true;
				sana_arvaus.setCharAt(i, merkki);
			}
		}
		if (ret == false)
			arvaukset--;
		return ret;
	}

	public String getSana() {
		return sana;
	}
	public StringBuilder getSanaArvaus() {
		return sana_arvaus;
	}
	public int getArvaus() {
		return arvaukset;
	}
	public List<Character> getArvausLista() {
		return arvauslista;
	}

	public void setSana(String sana) {
		this.sana = sana;
	}
	public void setSanaArvaus(StringBuilder sana_arvaus){
		this.sana_arvaus = sana_arvaus;
	}
	public void setArvaus(int arvaukset){
		this.arvaukset = arvaukset;
	}
	public void setArvausLista(ArrayList<Character> arvauslista){
		this.arvauslista = arvauslista;
	}

	public List<Character> arvaukset() {
		return arvauslista;
	}

	public int arvauksiaOnJaljella() {
		return arvaukset;
	}

	public String sana( ) {
		return sana;
	}

	public boolean onLoppu( ) {
		return sana.equalsIgnoreCase(sana_arvaus.toString());
	}

	/* Current state of game */
	public String toString() {
		return sana_arvaus.toString();
	}

}