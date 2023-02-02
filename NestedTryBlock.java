public class NestedTryBlock {

	public static void main(String args[]) {


	//outside try block
	try {
		
		//inside try block 1
		try{

			System.out.println("It going to divide by zero");
			int data=30/0;
		}


		//insdie catch block 1
		catch(ArithmeticException e) {

			System.out.println(e);
		}
		
		//inside try block 2
		try{
	
			int arr[]=new int[5];

			System.out.println(arr[10]);
		}
		
		//insdie catch block 2
		catch(java.lang.ArrayIndexOutOfBoundsException e) {

			System.out.println(e);
		}

	System.out.println("Rest of Code");
}

	catch(java.lang.Exception e) {

		System.out.println("outside Catch Block");
	}

	System.out.println("Normal flow of the application");

}
}			