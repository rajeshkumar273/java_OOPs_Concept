import java.io.*;

class ExceptionStudentDetails extends Exception 
{

private static int rno[]={001,002,003,004,005};
private static String names[]={"Rajesh","Charan","Sohail","Mani Deep","Rohith"};

private static int totals[]={352,452,532,256,354};

ExceptionStudentDetails() { //Default Constructor

}

ExceptionStudentDetails(String str) { //Parameterized Constructor

	super(str);

}


public static void main(String args[]) {


try {

	System.out.println("Roll No"+"\t"+"Student Name"+"\t"+"Student Marks");

	for(int i=0;i<5;i++)

	{

		System.out.println(" "+rno[i]+" "+names[i]+" "+totals[i]);

	if(totals[i]<350) //Displays own Exception if Marks below 350

	{

	ExceptionStudentDetails sd=new ExceptionStudentDetails("Student has failed... So Program has been stopped Execting...");

	throw sd;

	}

	} //Ending for loop
 
} // Ending Try Block

catch(ExceptionStudentDetails sd) {

	sd.printStackTrace();

}			

} //end of main

} //ending ExceptionStudentDetails class


