import java.util.Scanner;


class Exception {

	public static void main(String args[]) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 'a' value");
	int a=sc.nextInt();
	
	System.out.println("Enter 'b' value");
	int b=sc.nextInt();

	try {

	      //code that may raise exception  
	int data=a/b;    //may throw exception
			     // if exception occurs, the remaining statement will not exceute  



	System.out.println(data); 
	}

	
	catch(ArithmeticException e) {

		System.out.println(e);
	}
	//rest code of the program
	System.out.println("Rest of the code");
}

}

