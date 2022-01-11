package vol.rest.api.model;

public class Place {
	private int id;
	private TypePlace typePlace;
	private int price;
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public TypePlace getTypePlace() {
		return this.typePlace;
	}
	
	public void setTypePlace(TypePlace typePlace) {
		this.typePlace = typePlace;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
}