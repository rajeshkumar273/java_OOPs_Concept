//Rule: If there is an abstract method in a class, that class must be abstract.



abstract class Bike {

	Bike() {

		System.out.println("Bike is created");
	}
	
	abstract void run();
	void changeGear() {
		System.out.println("Changing Gear Successfully");
	}

}


class Honda extends Bike {

	void run() {

		System.out.println("Running Successfully");
	}

}


class Abstraction_3 {
		public static void main(String args[]) {
	
		Bike b=new Honda();
		b.changeGear();
		b.run();
		

}

}
