package vol.rest.api.service;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import vol.rest.api.DevDatabases;
import vol.rest.api.model.Place;

public class PlaceService {
	public ArrayList<Place> getAllPlaces(){
		return new DevDatabases().places;
	}
	
	/**
	 * Transform one place to JSONObject
	 * @param place
	 * @return a JSONObject of a company
	 */
	@SuppressWarnings("unchecked")
	public JSONObject placeToJson(Place place) {
		JSONObject s = new JSONObject();
		s.put("id", place.getId());
		s.put("placetype", place.getTypePlace());
		s.put("price", place.getPrice());
		return s;
	}
	
	/**
	 * Transform a list of companies into JSONArray
	 * @return all places in a JSONArray
	 */
	@SuppressWarnings("unchecked")
	public JSONArray toJson(ArrayList<Place> places) {
		JSONArray placesJSON = new JSONArray();
		for (Place place: places) {
			placesJSON.add(this.placeToJson(place));
		}
		return placesJSON;
	}
}