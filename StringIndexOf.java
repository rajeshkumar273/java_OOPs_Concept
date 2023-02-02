public class StringIndexOf {

	public static void main(String args[]) {

	String ipAddress="122.71.1.45";

	System.out.println("IP Address: "+ipAddress);

	int index1=ipAddress.indexOf(".");

	System.out.println(index1);
	int index2=ipAddress.indexOf(".");
	System.out.println(index1+index2);

	int index3=ipAddress.indexOf(".");
	System.out.println(index1+index2+index3);

	//something is wrong in logic
}

}
