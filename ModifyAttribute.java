public class ModifyAttribute {

	int x=10;
	final int y=16;
	int z;
	
	public static void main(String args[]) {

	ModifyAttribute myobj=new ModifyAttribute();

	myobj.x=25;
	//myobj.y=39; will generate an error: cannot assign a value to a final variable

	myobj.z=35;
	System.out.println(myobj.x);
	System.out.println(myobj.y);
	System.out.println(myobj.z);
	
}

}