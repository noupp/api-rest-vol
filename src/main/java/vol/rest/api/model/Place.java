package vol.rest.api.model;

public class Place {
	private int id;
	private PlaceType typePlace;
	private int price;
	
	public Place(int id, PlaceType typePlace, int price) {
		this.id = id;
		this.typePlace = typePlace;
		this.price = price;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public PlaceType getTypePlace() {
		return this.typePlace;
	}
	
	public void setTypePlace(PlaceType typePlace) {
		this.typePlace = typePlace;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
}