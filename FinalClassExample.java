final class Bike {   //The class cannot be inherited by other classes 

	protected String Brand="KTM";
	public void speed(int maxSpeed) {

	System.out.println("The Maximum Speed: "+maxSpeed);

	}

}

class FinalClassExample extends Bike{

	private int makingYear=2019;

	public static void main(String args[]) {

	FinalClassExample obj=new FinalClassExample();
	
	System.out.println("Brand:"+obj.Brand);
	
	obj.speed(150);
	
	System.out.println("Making year: "+obj.makingYear);

	}
}