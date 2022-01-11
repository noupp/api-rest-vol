package vol.rest.api.service;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import vol.rest.api.DevDatabases;
import vol.rest.api.model.Flight;

public class FlightService {
	public ArrayList<Flight> getAllFlights(){
		return new DevDatabases().flights;
	}
	
	/**
	 * Transform one place to JSONObject
	 * @param place
	 * @return a JSONObject of a company
	 */
	@SuppressWarnings("unchecked")
	public JSONObject volToJson(Flight vol) {
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
			volsJSON.add(this.volToJson(vol));
		}
		return volsJSON;
	}
}