package vol.rest.api.model;

import java.util.ArrayList;
import java.util.Date;

public class Flight {
	private int id;
	private ArrayList<Place> places;
	private Date date;
	
	public Flight(int id, ArrayList<Place> places, Date date){
		this.id = id;
		this.places = places;
		this.date = date;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public ArrayList<Place> getPlaces() {
		return this.places;
	}
	
	public void setPlaces(ArrayList<Place> places) {
		this.places = places;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
}