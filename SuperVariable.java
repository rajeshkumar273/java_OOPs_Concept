/* 

	If sub class and super class instance variables are not same than there is no need of super keyword.


*/

class Display {

	int num=150;

}

class Show extends Display {

	int num=200;

	public void read() {
		//super class instance variable will be referred.
		System.out.println("The Super class varible value is:"+super.num);
	}

}

class SuperVariable extends Show {

	public static void main(String args[] ) {

	SuperVariable obj=new SuperVariable();

	obj.read();
}

}
