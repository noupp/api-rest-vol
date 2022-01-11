package vol.rest.api.model;

import java.util.ArrayList;

public class Compagnie {
	private int id;
	private String name;
	private ArrayList<Vol> vols;
	
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
	
	public ArrayList<Vol> getVols() {
		return this.vols;
	}
	
	public void setVols(ArrayList<Vol> vols) {
		this.vols = vols;
	}
}