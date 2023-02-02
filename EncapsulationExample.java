class Employee {

	private String name;
	private int empid;

	//Getter 

	public String getName() {

		return name;

	}

	public int getEmpid() {

		return empid;

	}


	void display() {
	System.out.println("Information from Display Method:");
	System.out.println("Employee Name: "+name);
	System.out.println("Employee Id: "+empid);
	}
	//Setter 

	public void setName(String newName) {

		if(newName == "Amex User") {

		this.name=newName;

		}
	}
	public void setEmpid(int newEmpid) {

		if(newEmpid == 27) {

		this.empid=newEmpid;
		}
	}

}

public class EncapsulationExample {

	public static void main(String args[]) {

	Employee obj=new Employee();
	
	obj.setName("Amex User");
	obj.setEmpid(27);
	obj.display();
	
	
	System.out.println("Employee Name: "+obj.getName());
	System.out.println("Employee Id: "+obj.getEmpid());
}

}


	