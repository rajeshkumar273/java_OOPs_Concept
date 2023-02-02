class Display {

	public void display () {

		System.out.println("This is super class Display Method");
	}

}

class Show extends Display {

	public void display() {
			System.out.println("This is Sub class Display Method");
	}

	public void show() {
		
		//super class display method is called.
		super.display();
		System.out.println("This is Show Method");
		display();


		/*
		If super class and subclass not have same methods and method of super class is called from subclass method than super class method is called.
		There is  no need of super keyword. */


	}

}

class SuperMethod extends Show {

	public static void main(String args[]) {

	SuperMethod obj=new SuperMethod();
	
	obj.show();


}

}
