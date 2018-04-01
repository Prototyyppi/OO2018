package asunto;
import java.io.*;
import java.util.Scanner;
import java.lang.Integer;
import java.util.regex.*;

public class Tontti {
	private String name;
	private String latitude;
	private String longitude;
	private double area;
	private Rakennus rak;

	public Tontti(String name, String longitude, String latitude, double area, double rak_area,
										int rooms, int people) throws IllegalArgumentException {
	//These are here again just to be safe...
	if (area < 0) {
		throw new IllegalArgumentException("Negative value NOT allowed. Exiting...");
	}
		//Sanity check for latitude and longitude
		String longitude_pattern = "(\\d{2}\\.\\d{3}N|S|n|s$)";
		String latitude_pattern = "(\\d{2}\\.\\d{3}E|e|W|w$)";

		Pattern lon = Pattern.compile(longitude_pattern);
		Pattern lat = Pattern.compile(latitude_pattern);

		Matcher lon_match = lon.matcher(longitude);
		Matcher lat_match = lat.matcher(latitude);
		// See if both matched
		if (!(lon_match.find() && lat_match.find())){
			throw new IllegalArgumentException("GPS value problem. Exiting...");
		}
		this.name = name;
		this.longitude = longitude;
		this.latitude = latitude;
		this.area = area;
		//Make the rakennus that is in the tontti
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
		return "Tontin tiedot:\n" + "Tontin nimi: " + getName() + 
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
	public int setAsukas(String name, String birthDay) {
		int ok;
		ok = rak.setAsukas(name, birthDay);
		return ok;
	}
	public String getAsukas(int i) {
		return rak.getAsukas(i);
	}
	public int getAsukasLkm() {
		return rak.getAsukasLkm();
	}
}