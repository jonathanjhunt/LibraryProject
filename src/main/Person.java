package main;

public class Person {
	//attributes
			protected String firstName;
			protected String secondName;
			protected String postCode;
			protected boolean accountActive;
			protected int age;
			protected int lateReturn;
			
			public boolean accountActive() {
				// TODO Auto-generated method stub
			return true;
		}
		//general layout
		public Person() {
			this("???","???","???", true, 0, 0);
		}
		//sets format
		public Person(String firstName, String secondName, String postCode, boolean active, int age, int lateReturns) {
			this.firstName = firstName;
			this.secondName = secondName;
			this.postCode = postCode;
			this.accountActive = active;
			this.age = age;
			this.lateReturn = lateReturns;
		}
	}

