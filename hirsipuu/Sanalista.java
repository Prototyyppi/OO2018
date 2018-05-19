import java.io.*;
import java.util.*;
import java.lang.*;
public class Sanalista {

	private ArrayList<String> arr = new ArrayList<String>();
	public Sanalista(String sanalista_file) throws FileNotFoundException {
		//Lue sanat tiedostosta LIST rakenteeseen
		//TODO error check
		Scanner input = new Scanner(new File(sanalista_file));

		while(input.hasNext()) {
			String word = input.next();
			word.toUpperCase();
			//TODO Check if it is alredy there
			arr.add(word);
		}
		input.close();
	}

	public Sanalista() {
	// No need to do anything here
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
			throw new java.lang.Error("Was empty, nothing we can do");
		return new_sanalista;
	}

	public Sanalista sanaJoissaMerkit( String mjono ) {
		//TODO testing
		Sanalista new_sanalista = new Sanalista();
		int potential_add = 0;
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
