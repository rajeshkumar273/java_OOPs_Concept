public class ConstructorOverLoading {
	long accNumber;
	double balance;
	String name;
	
	public ConstructorOverLoading(long accNumber,double balance, String name) {

	this.accNumber=accNumber;
	this.balance=balance;
	this.name=name;

	}

	public ConstructorOverLoading(double balance) {

	this.balance=balance;
	}

	public ConstructorOverLoading() {

	}


	public static void main(String args[]) {

	ConstructorOverLoading obj=new ConstructorOverLoading();
	System.out.println(obj.accNumber+" "+obj.balance+" "+obj.name);

	ConstructorOverLoading obj1=new ConstructorOverLoading(9886723610L,85000.50,"Rajesh");
	System.out.println(obj1.accNumber+" "+obj1.balance+" "+obj1.name);

	ConstructorOverLoading obj2=new ConstructorOverLoading(95000.50);
	System.out.println(obj2.accNumber+" "+obj2.balance+" "+obj2.name);
}

}

	
		




	