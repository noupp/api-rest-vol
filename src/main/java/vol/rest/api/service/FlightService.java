package vol.rest.api.service;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import vol.rest.api.DevDatabases;
import vol.rest.api.model.Flight;
import vol.rest.api.model.Place;

public class FlightService {
	
	public ArrayList<Flight> getAllFlights(){
		return new DevDatabases().flights;
	}
	
	public Flight getFlightById(int id) {
		return new DevDatabases().flights.get(id);
	}
	
	public ArrayList<Place> getAllPlacesFromFlight(int id){
		return new DevDatabases().flights.get(id).getPlaces();
	}
	
	/**
	 * Transform one place to JSONObject
	 * @param place
	 * @return a JSONObject of a company
	 */
	@SuppressWarnings("unchecked")
	public JSONObject flightToJson(Flight vol) {
		JSONObject s = new JSONObject();
		s.put("id", vol.getId());
		s.put("date", vol.getDate());
		return s;
	}
	
	/**
	 * Transform a list of companies into JSONArray
	 * @return all places in a JSONArray
	 */
	@SuppressWarnings("unchecked")
	public JSONArray toJson(ArrayList<Flight> vols) {
		JSONArray volsJSON = new JSONArray();
		for (Flight vol: vols) {
			volsJSON.add(this.flightToJson(vol));
		}
		return volsJSON;
	}
}