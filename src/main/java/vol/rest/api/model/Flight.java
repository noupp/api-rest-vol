package vol.rest.api.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Flight {
	private int id;
	private LocalDate date;
	private String departure;
	private String destination;

	private ArrayList<Place> places;
	
	public Flight(int id, ArrayList<Place> places, LocalDate date, String departure, String destination){
		this.id = id;
		this.places = places;
		this.date = date;
		this.departure = departure;
		this.destination = destination;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public LocalDate getDate() {
		return this.date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public String getDeparture() {
		return this.departure;
	}
	
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	
	public String getDestination() {
		return this.destination;
	}
	
	public void setDate(String destination) {
		this.destination = destination;
	}
	
	public ArrayList<Place> getPlaces() {
		return this.places;
	}
	
	public void setPlaces(ArrayList<Place> places) {
		this.places = places;
	}
}