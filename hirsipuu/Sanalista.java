import java.io.*;

public class Sanalista {

	private ArrayList arr = new Arraylist();

	public Sanalista(String sanalista_file) {
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

}
