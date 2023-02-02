import java.util.Scanner;

public class ThisKeyWordExample {

	String name="Rajesh";
	int age=24;

	public void display(String name, int age) {

	System.out.println(name);
	System.out.println(age);
	System.out.println("This Name: "+this.name);
	System.out.println("This Age: "+this.age);
	
	}

	public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

	System.out.println("Enter Name:");
        String name=sc.next();
	System.out.println("Enter Age:");
	int age=sc.nextInt();

	ThisKeyWordExample obj=new ThisKeyWordExample();
	obj.display(name,age);
       
	
	}

 }