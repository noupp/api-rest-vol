package vol.rest.api;

import java.time.LocalDate;
import java.util.ArrayList;

import vol.rest.api.model.Company;
import vol.rest.api.model.Place;
import vol.rest.api.model.PlaceType;
import vol.rest.api.model.Flight;

public class DevDatabases {
	
	public ArrayList<Company> companies = new ArrayList<Company>();
	public ArrayList<Flight> flights = new ArrayList<Flight>();
	public ArrayList<Place> places = new ArrayList<Place>();

	public DevDatabases() {
		//Company 0
		Place place0 = new Place(0, PlaceType.BusinessClass, 10);	
		Place place1 = new Place(1, PlaceType.FirstClass, 20);	
		Place place2 = new Place(2, PlaceType.EconomyClass, 5);
		ArrayList<Place> places0 = new ArrayList<Place>();
		places0.add(place0);places0.add(place1);places0.add(place2);
		Flight flight0 = new Flight(0, places0, LocalDate.parse("2022-01-10"), "Marseille", "Paris");
		
		Place place3 = new Place(3, PlaceType.BusinessClass, 10);	
		Place place4 = new Place(4, PlaceType.FirstClass, 20);	
		Place place5 = new Place(5, PlaceType.EconomyClass, 5);
		ArrayList<Place> places1 = new ArrayList<Place>();
		places1.add(place3);places1.add(place4);places1.add(place5);
		Flight flight1 = new Flight(1, places1, LocalDate.parse("2022-01-11"), "Lyon", "Brest");
		
		ArrayList<Flight> flights0 = new ArrayList<Flight>();
		flights0.add(flight0); flights0.add(flight1);
		Company company0 = new Company(0, "airfrance", flights0);
		
		companies.add(company0);
		
		//Company 1
		Place place6 = new Place(6, PlaceType.BusinessClass, 10);	
		Place place7 = new Place(7, PlaceType.FirstClass, 20);	
		Place place8 = new Place(8, PlaceType.EconomyClass, 5);
		ArrayList<Place> places2 = new ArrayList<Place>();
		places2.add(place6);places2.add(place7);places2.add(place8);
		Flight flight2 = new Flight(2, places2, LocalDate.parse("2022-01-12"), "Paris", "Tokyo");
		
		Place place9 = new Place(9, PlaceType.BusinessClass, 10);	
		Place place10 = new Place(10, PlaceType.FirstClass, 20);	
		Place place11 = new Place(11, PlaceType.EconomyClass, 5);
		ArrayList<Place> places3 = new ArrayList<Place>();
		places3.add(place9);places3.add(place10);places3.add(place11);
		Flight flight3 = new Flight(3, places3, LocalDate.parse("2022-01-13"), "Seoul", "Beijing");
		
		ArrayList<Flight> flights1 = new ArrayList<Flight>();
		flights1.add(flight2); flights1.add(flight3);
		Company company1 = new Company(1, "cocorico", flights1);
		
		companies.add(company1);
		
		//Fill sub array
		companies.forEach(c -> c.getFlights().forEach(v -> flights.add(v)));
		companies.forEach(c -> c.getFlights().forEach(v -> v.getPlaces().forEach(p -> places.add(p))));
	}
}