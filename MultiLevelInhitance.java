class Person {

	Person() {
		System.out.println("Person Constructor"); 
	}

	void nationality() {

		System.out.println("Indian");
	}

	void place() {

		System.out.println("Guntur Andhra Pradesh");
	}

}


class Employee extends Person {

	Employee() {

		System.out.println("Employee Constructor");
	}

	void organization() {

		System.out.println("ATOS");

	}

	void place() {

		System.out.println("Tamil Nadu");
	}


}


class Manager extends Employee {

	Manager() {

		System.out.println("Manager Constructor");
	}

	void subOrdinates() {

		System.out.println("Amex Team Working are 12");

	}


	void place() {

		System.out.println("New York");

	}


}


class MultiLevelInhitance {

	public static void main(String args[]) {

	Manager m=new Manager();
	m.nationality();
	m.subOrdinates();
	m.place();
	m.organization();


	}

}

	 