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
	
	
	public boolean removeItem(LibraryItem item)
	{
		return this.items.remove(item);
	}
	
	public Object listItem(LibraryItem item)
	{
		return this.items.toArray();
	}
	@Override
	public String toString() 
	{
		return "ItemList [items=" + items + "]";
	}

	public int size() {
		// TODO Auto-generated method stub
		return this.items.size();
	}

	public char[] get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}