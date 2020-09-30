package main;

public class Books extends LibraryItem{

	private boolean hardBack;
	
	public Books() {
			super();
	}
	
	public Books(String name, String author, String classification, boolean available, int condition, int ID, boolean hardBack){
		super(name, author, classification, available, condition, ID);
		this.setHardBack(hardBack);
	}

	public boolean isHardBack() {
		return hardBack;
	}

	public void setHardBack(boolean hardBack) {
		this.hardBack = hardBack;
	}
	
}
