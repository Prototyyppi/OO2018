package asunto;
import java.io.*;
import java.util.Scanner;
import java.lang.Integer;

public class Tontti {
	private String name;
	private String latitude;
	private String longitude;
	private double area;
	private Rakennus rak;

	public Tontti(String name, String longitude, String latitude, double area) {
		setName(name);
		setLongitude(longitude);
		setLatitude(latitude);
		setArea(area);
		Rakennus rakennus = new Rakennus(5, 2, 2);
		setRakennus(rakennus);
	}

	public String getName() {
		return name;
	}
	public String getLatitude() {
		return latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public double getArea() {
		return area;
	}
	public void setRakennus(Rakennus rakennus) {
		rak = rakennus;
	}
	public void printInfo() {
		System.out.println("Tontin imi: " + getName());
		System.out.println("Longituudi: " + getLongitude());
		System.out.println("Latituudi: " + getLatitude());
		System.out.println("Pinta-ala: " + getArea());
		rak.printInfo();
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public void setArea(double area) {
		this.area = area;
	}
}