import java.util.Scanner;
import java.lang.Exception;

//we handle the exception using the parent class exception.


class TryCatchBlock {

	public static void main(String args[]) {

	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter 'a' value:");
	
	int a=sc.nextInt();
	
	System.out.println("Enter 'b' value:");
	
	int b=sc.nextInt();
	int data;


	try {

	 data=a/b;
	
	System.out.println(data);

	}


	// handling the exception by using Exception class   
	catch(Exception e) {
		
		//System.out.println(e);

	
		System.out.println(a/(b+2));
	}

	System.out.println("Rest of the Code");
}

}


		
	
	

	