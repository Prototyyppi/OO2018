import java.io.*;
import java.util.*;
import java.lang.*;

public class Sanalista {

	private ArrayList<String> arr = new ArrayList<String>();

	public Sanalista(String sanalista_file) throws FileNotFoundException {

		Scanner input = new Scanner(new File(sanalista_file));

		while(input.hasNext()) {
			String word = input.next();
			word = word.toUpperCase();
			arr.add(word);
		}
		input.close();
	}

	public Sanalista() {
	// No need to do anything here
	}

	public List<String> getLista() {
		return arr;
	}

	public void setLista(ArrayList<String> lista){
		this.arr = lista;
	}

	public List<String> annaSanat( ){
		return arr;
	}

	public Sanalista sanatJoidenPituusOn( int pituus ){
		Sanalista new_sanalista = new Sanalista();
		for (String element : arr) {
			if (element.length() == pituus)
				new_sanalista.add(element);
		}
		if (new_sanalista.IsEmpty())
			throw new java.lang.Error("No matching elements, exiting..");
		return new_sanalista;
	}

	public Sanalista sanaJoissaMerkit( String mjono ) {

		Sanalista new_sanalista = new Sanalista();
		int potential_add = 0;
		mjono = mjono.toUpperCase();
		for (String element : arr) {
			if (element.length() == mjono.length()) {
				for (int i=0; i < element.length(); i++) {
					if ((element.charAt(i) == mjono.charAt(i)) || (mjono.charAt(i) == '_'))
						potential_add = 1;
					else {
						potential_add = 0;
						break;
					}
				}
				if (potential_add == 1)
					new_sanalista.add(element);
			}
		}
		if (new_sanalista.IsEmpty())
			throw new java.lang.Error("No matching elements, exiting..");
		return new_sanalista;
	}
	public String toString() {
		return "\n";
	}
	public int size() {
		return arr.size();
	}
	public String get(int i) {
		return arr.get(i);
	}
	public void add(String i) {
		arr.add(i);
	}
	public boolean IsEmpty() {
		return arr.isEmpty();
	}
}
