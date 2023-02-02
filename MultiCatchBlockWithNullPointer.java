class MultiCatchBlockWithNullPointer {

	public static void main(String args[]) {

	try {

	String s=null;
	System.out.println(s.length());
	
	}

	catch(ArithmeticException e) {
		System.out.println(e);
	}

	catch(java.lang.ArrayIndexOutOfBoundsException e) {

		System.out.println(e);
	}

	catch(java.lang.Exception e) {
		System.out.println(e);
	}
		
	System.out.println("Rest of the code");	


	}
}

	