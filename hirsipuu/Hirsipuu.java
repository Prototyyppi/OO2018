import java.io.*;
import java.util.*;
import java.lang.*;

public class Hirsipuu {
private String sana;
private StringBuilder sana_arvaus;
private int arvaukset;
private ArrayList<Character> arvauslista = new ArrayList<Character>();

	public Hirsipuu(Sanalista lista, int arvaukset) {
		Random rand = new Random();
		int n = rand.nextInt(lista.size());
		sana = lista.get(n);
		this.arvaukset = arvaukset;
		sana_arvaus = new StringBuilder(new String(new char[sana.length()]).replace('\0', '_'));
	}

	public boolean arvaa( Character merkki ) {
		boolean ret = false;
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

	public List<Character> arvaukset(){
		return arvauslista;
	}

	public int arvauksiaOnJaljella(){
		return arvaukset;
	}

	public String sana( ){
		return sana;
	}

	public boolean onLoppu( ){
		return sana.equalsIgnoreCase(sana_arvaus.toString());
	}

	public String toString() {
		return sana_arvaus.toString();
	}

}