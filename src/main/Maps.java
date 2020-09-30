package main;

public class Maps extends LibraryItem{

	private String Country;
	
	public Maps() {
			super();
	}
	
	public Maps(String name, String author, String classification, boolean available, int condition, int ID, String Country){
		super(name, author, classification, available, condition, ID);
		this.setCountry(Country);
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}
}