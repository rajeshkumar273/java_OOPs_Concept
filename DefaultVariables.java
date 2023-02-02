class DefaultVariables {
  String fname = "Rajesh";
  String lname = "Kumar";
  String email = "rajeshkumar@doe.com";
  int age = 24;
  
//The code is only accessible in the same package.
//This is used when you don't specify a modifier.


  public static void main(String[] args) {
    DefaultVariables myObj = new DefaultVariables();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}