import java.io.*;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
import java.lang.Integer;
import java.util.regex.*;

/* Tallennan InsuranceInfo olioita vectoriin */
public class InsInfoContainer {
	/* Vector with initial size of 10. (default w/o params) */
	Vector<InsuranceInfo> vector = new Vector<InsuranceInfo>();

	public InsInfoContainer() {	}

	public void addElem(InsuranceInfo ins) {
		vector.addElement(ins);
	}

	public String toString() {
		return "\n";
	}

	public void printVector() {
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
				element.toString();
		}
	}
}