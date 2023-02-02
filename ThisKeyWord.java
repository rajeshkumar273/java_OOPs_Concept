public class ThisKeyWord {

	String name;
	int age;
	
	public ThisKeyWord(String newName, int newAge) {

	this.name=newName;
	this.age=newAge;

	}
	
	void display() {

	System.out.print("You name is: "+name+"\n"+"You are "+age+" old");

	}


	public static void main(String args[]) {
	
	ThisKeyWord obj=new ThisKeyWord("Rajesh",24);
	obj.display();

	}
}

	

		
	

	