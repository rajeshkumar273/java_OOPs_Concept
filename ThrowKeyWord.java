import java.util.Scanner;

public class ThrowKeyWord {

	public static void validate(int age) {

		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age");
		int age=sc.nextInt();

		*/
	
		try {
			if(age<18) {

			throw new ArithmeticException("Person is not eligible for vote");
			}	

		else {

			System.out.println("Congrate!, you are eligible for vote");
			}
		}
	
		finally {

			System.out.println("Finally Block");
		}

}


	public static void main(String args[]) {

		ThrowKeyWord.validate(19);
		//ThrowKeyWord.validate(19);

}
}

		