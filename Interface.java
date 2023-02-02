interface Printable {
	void print();

}

class Interface implements Printable {
		
	public void print() {

		System.out.println("Printing");
	}

	public static void main(String args[]) {
		Interface i=new Interface();
		i.print();
	}

}

