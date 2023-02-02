class A {

	protected void show() {
	
	System.out.println("Working");


	}

}

class MethodOverridingAccessModifier extends A {

	/* void show() {
		System.out.println(" Protected Access UnderWorking");  //compile-time error. attempting to assign weaker access privileges; was protected
	}
	
	*/
	
	@Override
	public void show() {
		System.out.println(" Public Access Working");
	}

	public static void main(String args[]) {

	MethodOverridingAccessModifier obj=new MethodOverridingAccessModifier();
	obj.show();


	}

}
		
		