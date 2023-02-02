import java.util.Scanner;
public class TernaryOperator {

	public static void main(String args[]) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First Number");
	int n1=sc.nextInt();
	System.out.println("Enter Second Number");
	int n2=sc.nextInt();

	int min=(n1>n2)?n1:n2;

	System.out.println("Minimum Value: "+min);

	}
}

	