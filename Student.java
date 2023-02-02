class ProtectedVariables {

protected String fname="Rajesh";
protected String lname="Kumar";
protected String email="rajeshkumar@deo.com";
protected int age=24;

}


class Student extends ProtectedVariables{  // Save file with Student Name 
	private int graduationYear=2015;

	public static void main(String args[]) {
	
	Student obj=new Student();

	System.out.println("Name:"+obj.fname+" "+obj.lname);
	System.out.println("Email:"+obj.email);
	System.out.println("Age:"+obj.age);
	System.out.println("Graduation year:"+obj.graduationYear);
}

}