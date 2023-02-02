public class PrivateVariables {
  private String fname="Rajesh";
  private String lname="Kumar";
  private String email="rajeshkumar@deo.com";
  private int age=24;

  public static void main(String args[]) {

  PrivateVariables obj=new PrivateVariables();
  System.out.println("Name:"+obj.fname+" "+obj.lname);
  System.out.println("Email:"+obj.email);
  System.out.println("Age:"+obj.age);
  }
}
