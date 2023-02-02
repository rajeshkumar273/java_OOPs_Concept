class WrapperToPrimitive {

public static void main(String args[]) {

	Integer i=new Integer(25);
	
	int j=i; //unboxing an object
	
	int ab=i.intValue();             // <variable_name>.intValue();

	System.out.println("Value of i: "+i);
	System.out.println("Value of j: "+j);
	System.out.println("Value of ab: "+ab);
	
	}

}
	