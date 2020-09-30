package main;

import java.util.ArrayList;
import java.util.List;

public class LibraryList {
	private List<LibraryItem> items = new ArrayList<>();

	public LibraryList()
	{
		super();
	}
	
	public boolean addItem(LibraryItem item)
	{
		return this.items.add(item);
	}
	
	@Override
	public String toString() 
	{
		return "ItemList [items=" + items + "]";
	}
	
}