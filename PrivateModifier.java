class Super {

	public int i=10;
	protected int j=20;
	private int k=25;
	
}

class Sub extends Super {

	void write() {

	System.out.println("Value of i: "+i);
	System.out.println("Value of j: "+j);
	System.out.println("Value of K: "+k);

	}

}

class PrivateModifier {

	public static void main(String args[]) {

	Sub obj= new Sub();
	obj.write();
	}

}
