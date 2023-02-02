import java.util.Scanner;

//we will use the nextLine() method, which is used to read a complete line:

class NextLine_Next { 

	public static void main(String args[]) {

	Scanner sc=new Scanner(System.in);
	
	//System.out.println("Enter UserName:");	
	//String userName=sc.next();

	System.out.println("Enter A Line:");	
	String line=sc.nextLine();
	
	//System.out.println("UserName is: "+userName);
	System.out.println("Given Line is: "+line);
}

}
	