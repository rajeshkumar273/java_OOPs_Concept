interface Imouse {
	
	public void click();
	public void rightClick();
	public void doubleClick();

}

class CompImple implements Imouse {

	@Override
	public void click() {

		System.out.println("Resources get Selected");
	}

	@Override 
	public void rightClick() {

		System.out.println("Display / Show Options ");
	}

	@Override
	public void doubleClick() {

		System.out.println("Double Click");
	}

}


class Interface_1 {

	public static void main(String args[]) {

	Imouse m=new CompImple();
	m.click();
	m.rightClick();
	m.doubleClick();
	
	}
}

