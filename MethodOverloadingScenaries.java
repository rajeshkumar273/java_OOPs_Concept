class Student {


	// changing parameters
	public int addition (int x,int y) {

		return x+y;
	}
		
	public int addition (int x,int y,int z) {
		
		return x+y+z;

	}

	// changing data types 
	
	public double addition(double x, double y) {

		return x+y;
	}

	//changing order of data types 
	public void studentId (int id, String name) {

		System.out.println("Student Id: "+id+" Student Name: "+name);
	}

	public void studentId(String name,int id) {

		System.out.println("Student Id: "+id+" Student Name: "+name);
	}

	//Static Methods Overloading 

	static float  plusMethod(float x, float y) {

		float result=x+y;
		return result;
	}

	static float plusMethod(float x,float y,float z) {

		float result1=x+y+z;
		return result1;

	}

	/*
	//can we overload main method in java 
		 //Yes

	
	//Normal Method
	public static void main(String[] args){ 

		System.out.println("Hi Rajesh from(Main Method)");

		MainMethodOverloading.main("Rajesh");

	}

	//Overloaded main methods 
	public static void main(String arg1) {

		System.out.println("Hi "+arg1);
		MainMethodOverloading.main("Dear Rajesh", "I'm Fine");
	}


	public static void main(String arg1,String arg2) {

		System.out.println("Hi "+arg1+" How are you?"+arg2); 
	}

	*/

}


class MethodOverloadingScenaries {

	public static void main(String args[]) {

		
	Student obj=new Student();
	System.out.println(obj.addition(10,20));
	System.out.println(obj.addition(10,20,30));
	System.out.println(obj.addition(7.75,20.12));
	obj.studentId(27,"Rajesh");
	obj.studentId("Kumar",03);
	

	System.out.println("Static Method: "+obj.plusMethod(7.75f,20.12f));
	System.out.println("Static Method: "+obj.plusMethod(7.75f,20.12f,45.54f));

	}

}	


	