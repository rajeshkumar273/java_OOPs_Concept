class MainMethodOverloading{


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
		MainMethodOverloading.main("Dear Rajesh,", "I'm Fine");
	}


	public static void main(String arg1,String arg2) {

		System.out.println("Hi, "+arg1+" How are you? "+arg2); 
	}
}