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

	public Tontti(String name, String longitude, String latitude, double area, double rak_area, 
																			int rooms, int people) {
		this.name = name;
		this.longitude = longitude;
		this.latitude = latitude;
		this.area = area;
		Rakennus rakennus = new Rakennus(rak_area, rooms, people);
		this.rak = rakennus;
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
	public String toString() {
		return "Tntin tiedot:\n" + "Tontin nimi: " + getName() + 
				" \nTontin Latituudi: " + getLatitude()+ " \nTontin Longituudi: " +
					getLongitude()+ " \nTontin ala: " + getArea() + rak.toString();
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