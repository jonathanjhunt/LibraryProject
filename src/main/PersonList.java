package main;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
	private List<Person> persons = new ArrayList<>();

	public PersonList()
	{
		super();
	}
	
	public boolean addPerson(Person person)
	{
		return this.persons.add(person);
	}
	
	@Override
	public String toString() 
	{
		return "PersonList [persons=" + persons + "]";
	}
	
}

