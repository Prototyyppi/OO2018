package asunto;
import java.io.*;
import java.util.Scanner;
import java.lang.Integer;

public class Rakennus {
	private double area;
	private int room_count;
	private int dwellers;

	public Rakennus(double area, int room_count, int dwellers) {
		int i;
		Asukkaat[] asukas = new Asukkaat[dwellers];
		for (i = 0; i < dwellers; i++) {
			asukas[i] = new Asukkaat(i+1);
		}
	}
	public void printInfo(){
		System.out.println("Rakennuksen ala: " + area);
		System.out.println("Huoneiden määrä: " + room_count);
		System.out.println("Ihmisten määrä " + dwellers);
		
	}

}