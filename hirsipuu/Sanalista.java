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
}


	public List<String> annaSanat( ){
		return arr;
	}
	public Sanalista sanatJoidenPituusOn( int pituus ){
		//TODO
		return this;
	}
	public Sanalista sanaJoissaMerkit( String mjono ) {
		//TODO
		return this;
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
}
