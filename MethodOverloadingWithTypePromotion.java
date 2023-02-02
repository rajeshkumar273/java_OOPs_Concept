class Calculation {

	public void sum(int a,long b) {

		System.out.println(a+b);
	}

	public void sum(int a, int b, int c) {

		
		System.out.println(a+b+c);
	}
	
	// Method Overloading with Type Promotion if matching found

	//If there are matching type arguments in the method, type promotion is not performed.

	public void plusMethod(int a, int b) {
		System.out.println("Int arg Method");
	}

	public void plusMethod(long a, long b) {


		System.out.println("Long Arg Method"); 
	}
		

	//Method Overloading with Type Promotion in case of ambiguity

	//If there are no matching type arguments in the method, and each method promotes similar number of arguments, there will be ambiguity.

	public void addition(int a,long b) {

			System.out.println("Int: "+(a+b));

	}

	public void addition(long a,int b) {

		System.out.println(a+b);
	}


}


class MethodOverloadingWithTypePromotion {

	public static void main(String args[]) {

	Calculation obj=new Calculation();
	obj.sum(20,20); //Now int literal will be promoted as long
	obj.sum(20,20,20);
	obj.plusMethod(30,20); //Now It return Int arg Method
	obj.addition(15,15); //Ambigity
}	

}
