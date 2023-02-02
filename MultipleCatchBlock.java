public class MultipleCatchBlock{

	public static void main(String args[]) {

	try {
	int arr[]=new int[5];
	
	arr[5]=30/0;
	System.out.println(arr[10]);

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

	System.out.println("Rest of the Code");
	
}

}
