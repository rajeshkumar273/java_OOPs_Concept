import java.util.Scanner;

class StudentsMarksArray {

	public static void main(String args[]) {

	try {

	int total_marks=0;
	
	Scanner sc=new Scanner(System.in);
	
	int marks[]=new int[5];
	
	System.out.println("Enter Student Marks:");	
	
	for(int i=0; i<marks.length; i++) {

		marks[i]=sc.nextInt();
	}


	for(int i=0;i<marks.length;i++) {

		total_marks=total_marks+marks[i];
	}

	
	System.out.println("Total Marks: "+total_marks);

	float temp=(float)total_marks/500;
	float avg=temp*100;

	System.out.println("Average Marks of Student: "+avg);
	
	}
	
	catch(ArithmeticException ae) {

		System.out.println(ae);

		System.out.println("Please Don't enter the Text instead of Marks... Tq Please Try Agian");

	}

	finally {
		System.out.println("Logout Successfully.");

	}
}

}

	