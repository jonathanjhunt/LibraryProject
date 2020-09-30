package main;

public class Newspapers extends LibraryItem{

	private int Date;
	
	public Newspapers() {
			super();
	}
	
	public Newspapers(String name, String author, String classification, boolean available, int condition, int ID, int Date){
		super(name, author, classification, available, condition, ID);
		this.setDate(Date);
	}

	public int getDate() {
		return Date;
	}

	public void setDate(int date) {
		Date = date;
	}
}