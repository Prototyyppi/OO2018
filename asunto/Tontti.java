package asunto;
import java.io.*;
import java.util.Scanner;
import java.lang.Integer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tontti {
	private String name;
	private String latitude;
	private String longitude;
	private double area;

	public Tontti(String name, String longitude, String latitude, double area) {
		if (area < 0) {
			throw new IllegalArgumentException("Negative value NOT allowed");
		}
		//Sanity check for latitude and longitude
		String longitude_pattern = "(\\d{2}\\.\\d{3}N|S|n|s$)";
		String latitude_pattern = "(\\d{2}\\.\\d{3}E|e|W|w$)";

		Pattern lon = Pattern.compile(longitude_pattern);
		Pattern lat = Pattern.compile(latitude_pattern);

		Matcher lon_match = lon.matcher(longitude);
		Matcher lat_match = lat.matcher(latitude);
		// See if either matched
		if (!(lon_match.find() && lat_match.find())){
			throw new IllegalArgumentException("GPS value problem");
		}
		this.name = name;
		this.longitude = longitude;
		this.area = area;
		this.latitude = latitude;
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

	public void printInfo() {
		System.out.println("Tontin tiedot: ");
		System.out.println("Tontin imi: " + getName());
		System.out.println("Longituudi: " + getLongitude());
		System.out.println("Latituudi: " + getLatitude());
		System.out.println("Pinta-ala: " + getArea());
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