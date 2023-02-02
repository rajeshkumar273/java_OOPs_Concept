class Display {

	public Display() {

		System.out.println("Super class Constructor is called");
	}

}

class SuperConstructor extends Display {
	
	SuperConstructor() {
	
		System.out.println("Current Class Constructor is called");
	}

	//super.Display();

	public static void main(String args[]) {
	
	SuperConstructor obj=new SuperConstructor();

	}

}

	