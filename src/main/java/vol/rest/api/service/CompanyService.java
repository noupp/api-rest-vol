package vol.rest.api.service;

import java.util.ArrayList;

import vol.rest.api.DevDatabases;
import vol.rest.api.model.Company;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CompanyService {
	
	public ArrayList<Company> getAllCompanies(){
		return new DevDatabases().companies;
	}
	
	public Company getCompanyById(int id) {
		return new DevDatabases().companies.get(id);
	}
	
	/**
	 * Transform one place to JSONObject
	 * @param place
	 * @return a JSONObject of a company
	 */
	@SuppressWarnings("unchecked")
	public JSONObject companyToJson(Company company) {
		JSONObject s = new JSONObject();
		s.put("id", company.getId());
		s.put("name", company.getName());
		s.put("vols", company.getVols());
		return s;
	}
	
	/**
	 * Transform a list of companies into JSONArray
	 * @return all places in a JSONArray
	 */
	@SuppressWarnings("unchecked")
	public JSONArray toJson() {
		JSONArray companiesJSON = new JSONArray();
		
		for (Company company: getAllCompanies()) {
			this.companyToJson(company);
			companiesJSON.add(company);
		}
		return companiesJSON;
	}
}