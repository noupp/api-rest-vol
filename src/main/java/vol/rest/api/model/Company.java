package vol.rest.api.model;

import java.util.ArrayList;

public class Company {
	private int id;
	private String name;
	private ArrayList<Flight> flights;
	
	public Company(int id, String name, ArrayList<Flight> flights) {
		this.id = id;
		this.name = name;
		this.flights = flights;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Flight> getFlights() {
		return this.flights;
	}
	
	public void setVols(ArrayList<Flight> flights) {
		this.flights = flights;
	}
}