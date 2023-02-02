class AbstractKeywordExample {

	public static void main(String args[]) {

	AbstractKeyword obj=new AbstractKeyword();
	System.out.println("Name:"+obj.fname+" "+obj.lname);
	System.out.println("Email:"+obj.email);
	System.out.println("Age:"+obj.age);
	//obj.study("History");
	obj.study();
	System.out.println("Graduation Year: "+obj.graduationYear);
}
}


	