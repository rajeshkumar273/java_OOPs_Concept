class Father {

	public void show() {

		System.out.println("Father");
	}

}

class Mother {

	public void work() {

		System.out.println("Mother");
	}

}

class MultipleInheritance extends Father,Mother { 

	public static void main(String args[]) {

	MultipleInheritance obj=new MultipleInheritance();

	obj.show();
	obj.work();
}
}


	