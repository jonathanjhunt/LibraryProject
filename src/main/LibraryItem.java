package main;

public class LibraryItem {
	//attributes
		protected String itemName;
		protected String itemAuthor;
		protected String itemClass;
		protected boolean inLibrary;
		protected int itemCondition;
		protected int itemID;
		private static int numberOfItems = 0;
		
		public boolean inLibrary() {
			// TODO Auto-generated method stub
		return true;
	}
	//general layout
	public LibraryItem() {
		this("???","???","???", false, 0, 0);
	}
	//sets format
	public LibraryItem(String name, String author, String classification, boolean available, int condition, int ID) {
		this.itemName = name;
		this.itemAuthor = author;
		this.itemClass = classification;
		this.inLibrary = available;
		this.itemCondition = condition;
		this.itemID = numberOfItems;
		numberOfItems++;
	}
	
	public void setinLibrary(boolean checkedOut)
	{
		this.inLibrary = checkedOut;
	}
	public boolean getinLibrary()
	{
		return inLibrary;
	}
	