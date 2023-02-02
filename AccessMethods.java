import java.util.Scanner;

public class AccessMethods {   //Access Methods With an Object

	public void fullThrottle() {

		System.out.println("The car is going as fast as it can");

	}

	public void speed(int maxSpeed) {


		System.out.println("The Maximum Car Speed is: "+maxSpeed);

	}

	public static void main(String args[]) {

	AccessMethods obj=new AccessMethods();

	obj.fullThrottle();
	obj.speed(200);
	}

}