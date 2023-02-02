abstract class Keyboard {
	int price;
	String brand;
	
	public Keyboard() {
	}

	public Keyboard(int price,String brand) {

	this.price=price;
	this.brand=brand;

	}
public void pressM() {

	System.out.println("Prints M");
	}

public void pressR() {

	System.out.println("Prints R");
	}

public void pressK() {

	System.out.println("Prints K");
}

public abstract void pressEnter();

}

class Image extends Keyboard {

	@Override 
	public void pressEnter() {

		System.out.println("Image gets Open");

	}
}

class Notepad extends Keyboard {

	@Override 
	public void pressEnter() {
		System.out.println("Controls goes to next Line");
	}

}

//public abstract class MusicFile extends Keyboard { }
		

class Abstraction_5 {

	public static void main(String args[]) {

		//Keyboard kb=new Keyboard(25,"Rajesh");
	
		Keyboard kb=new Image();
		kb.pressEnter();
		kb.pressM();
		kb.pressR();
		kb.pressK();

		
}

}


