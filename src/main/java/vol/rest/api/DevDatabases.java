package vol.rest.api;

import java.util.ArrayList;
import java.util.Date;

import vol.rest.api.model.Company;
import vol.rest.api.model.Place;
import vol.rest.api.model.TypePlace;
import vol.rest.api.model.Vol;

public class DevDatabases {
	
	public ArrayList<Company> companies = new ArrayList<Company>();
	
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
		ArrayList<Place> places1 = new ArrayList<Place>();
		places1.add(place3);places1.add(place4);places1.add(place5);
		Vol vol1 = new Vol(1, places1, new Date());
		
		ArrayList<Vol> vols0 = new ArrayList<Vol>();
		vols0.add(vol0); vols0.add(vol1);
		Company company0 = new Company(0, "Airfrance", vols0);
		
		companies.add(company0);
		
		Place place6 = new Place(6, TypePlace.BusinessClass, 10);	
		Place place7 = new Place(7, TypePlace.FirstClass, 20);	
		Place place8 = new Place(8, TypePlace.EconomyClass, 5);
		ArrayList<Place> places2 = new ArrayList<Place>();
		places2.add(place6);places2.add(place7);places2.add(place8);
		Vol vol2 = new Vol(2, places2, new Date());
		
		Place place9 = new Place(9, TypePlace.BusinessClass, 10);	
		Place place10 = new Place(10, TypePlace.FirstClass, 20);	
		Place place11 = new Place(11, TypePlace.EconomyClass, 5);
		ArrayList<Place> places3 = new ArrayList<Place>();
		places3.add(place9);places3.add(place10);places3.add(place11);
		Vol vol3 = new Vol(3, places2, new Date());
		
		ArrayList<Vol> vols1 = new ArrayList<Vol>();
		vols1.add(vol2); vols1.add(vol3);
		Company company1 = new Company(1, "Cocorico", vols1);
		
		companies.add(company1);
	}
}