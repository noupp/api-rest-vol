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
	public JSONObject flightToJson(Flight flight) {
		JSONObject s = new JSONObject();
		s.put("id", flight.getId());
		s.put("date", flight.getDate());
		s.put("departure", flight.getDeparture());
		s.put("destination", flight.getDestination());
		return s;
	}
	
	/**
	 * Transform a list of companies into JSONArray
	 * @return all places in a JSONArray
	 */
	@SuppressWarnings("unchecked")
	public JSONArray toJson(ArrayList<Flight> flights) {
		JSONArray flightsJSON = new JSONArray();
		for (Flight flight: flights) {
			flightsJSON.add(this.flightToJson(flight));
		}
		return flightsJSON;
	}
}