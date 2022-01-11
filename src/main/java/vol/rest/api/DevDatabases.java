package vol.rest.api;

import java.util.ArrayList;
import java.util.Date;

import vol.rest.api.model.Company;
import vol.rest.api.model.Place;
import vol.rest.api.model.TypePlace;
import vol.rest.api.model.Vol;

public class DevDatabases {
	
	public ArrayList<Company> companies;
	
	public DevDatabases() {
		Place place0 = new Place(0, TypePlace.BusinessClass, 10);	
		Place place1 = new Place(1, TypePlace.FirstClass, 20);	
		Place place2 = new Place(2, TypePlace.EconomyClass, 5);
		ArrayList<Place> places0 = new ArrayList<Place>();
		places0.add(place0);places0.add(place1);places0.add(place2);
		Vol vol0 = new Vol(0, places0, new Date());
		
		Place place3 = new Place(3, TypePlace.BusinessClass, 10);	
		Place place4 = new Place(4, TypePlace.FirstClass, 20);	
		Place place5 = new Place(5, TypePlace.EconomyClass, 5);
		ArrayList<Place> places2 = new ArrayList<Place>();
		places2.add(place3);places2.add(place4);places2.add(place5);
		Vol vol1 = new Vol(1, places2, new Date());
		
		ArrayList<Vol> vols0 = new ArrayList<Vol>();
		vols0.add(vol0); vols0.add(vol1);
		Company company0 = new Company(0, "Airfrance", vols0);
		
		companies.add(company0);
	}
}