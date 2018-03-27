package asunto;
import java.io.*;
import java.util.Scanner;
import java.lang.Integer;

public class Rakennus {
	private double area;
	private int room_count;
	private int dwellers;
	private Tontti tont;

	public Rakennus(double area, int room_count, int dwellers, Tontti tontti) {
		if (area < 0 || room_count < 0 || dwellers < 0) {
			throw new IllegalArgumentException("Negative value NOT allowed");
		}
		this.area = area;
		this.room_count = room_count;
		this.dwellers = dwellers;
		tont = tontti;
	}
	public void printInfo(){
		System.out.println("Rakennuksen ala: " + area);
		System.out.println("Huoneiden määrä: " + room_count);
		System.out.println("Ihmisten määrä " + dwellers);
		System.out.println("Ihmisten määrä " + dwellers);
		tont.printInfo();
		
	}
	public double getArea() {
		return area;
	}
	public int getRooms() {
		return room_count;
	}
	public int getPeople() {
		return dwellers;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setRooms(int rooms) {
		room_count = rooms;
	}
	public void setPeople(int people) {
		dwellers = people;
		//should add people objects now
	}
}