import java.io.*;
import java.util.Vector;


/* Tallennan InsuranceInfo olioita vectoriin */
public class InsInfoContainer {
	/* Vector with initial size of 10. (default w/o params). Here initialized to size of 1 */
	private Vector<InsuranceInfo> vector = new Vector<InsuranceInfo>(0);

	public InsInfoContainer() {	}

	public void addElem(InsuranceInfo ins) {
		/* addElement increades the vector length also by 1 */
		vector.addElement(ins);
	}

	public String toString() {
		return "\n";
	}

	public void printVector() {
		/* Using the method found in vector itself */
		System.out.println(vector.toString());
	}

	public void printInsValueLess(int threshold) {
		for (int i = 0; i < vector.size(); i++){
			InsuranceInfo element = vector.get(i);
			if (element.getInsValue() <= threshold)
				System.out.println(element.toString());
		}
	}

	public void printInsValueMore(int threshold) {
		for (int i = 0; i < vector.size(); i++){
			InsuranceInfo element = vector.get(i);
			if (element.getInsValue() >= threshold)
				System.out.println(element.toString());
		}
	}
}