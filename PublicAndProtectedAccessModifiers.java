class Super {

public int i=50;
protected int j=150;

}

class Sub extends Super {

void read() {

	System.out.println("Value of i: "+i);
	System.out.println("Value of j: "+j);

}
}

class PublicAndProtectedAccessModifiers {

	public static void main(String args[]) {

	Sub obj=new Sub();
	obj.read();

}

}

	