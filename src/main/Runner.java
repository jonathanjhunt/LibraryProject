package main;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person("Jonathan", "Hunt", "WS14 9HU", true, 23, 0 );
		Person person2 = new Person("Sam", "Horner", "WS14 9HU", true, 24, 0);
		Person person3 = new Person("Reece", "Elder", "WS14 9HU", true, 23, 0);
		Person person4 = new Person("Carlos", "Aguila", "WS14 9HU", true, 23, 0);
		
		PersonList personlist = new PersonList();
		
		personlist.addPerson(person1);
		personlist.addPerson(person2);
		personlist.addPerson(person3);
		personlist.addPerson(person4);
		
		Maps item1 = new Maps("Map of London", "Maps UK", "Maps", true, 5, 1, "United Kingdom");
		Books item2 = new Books("A song of Ice and Fire", "George RR Martin", "Books", true, 5, 2,true);
		Books item3 = new Books("Harry Potter & the Philosophers Stone", "J K Rowling", "Books", true, 2, 3, false);
		Maps item4 = new Maps("Map of France", "Maps FR", "Maps", true, 5, 4, "France");
		Newspapers item5 = new Newspapers("Daily Star", "Daily Star", "Newspapers", true, 1, 5, 20122003);
		
		LibraryList librarylist = new LibraryList();
		
		librarylist.addItem(item1);
		librarylist.addItem(item2);
		librarylist.addItem(item3);
		librarylist.addItem(item4);
		librarylist.addItem(item5);
		
		
		System.out.println(personlist);
		System.out.println(librarylist);
	}

}
