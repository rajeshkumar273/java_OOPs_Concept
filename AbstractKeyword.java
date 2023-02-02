//abstract class
abstract class Person {

	public String fname="Rajesh";
	public String lname="Kumar";
	public int age=24;
	public String email="rajeshkumar@deo.com";
	public abstract void study();  //abstract method

}

class AbstractKeyword extends Person {

	public int graduationYear=2022;
	
	public void study() {

	System.out.println("Right Now I am Studying. Thanks");
	}
	

	// error: AbstractKeyword is not abstract and does not override abstract method study() in Person
	//class AbstractKeyword extends Person {
	
	/*public void study(String subject) {
		

		System.out.println("Right Now I am Studying "+subject);
	}

	*/
}