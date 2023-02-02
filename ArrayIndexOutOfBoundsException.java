class ArrayIndexOutOfBoundsException {

	public static void main(String args[]) {
	
	

	try {
	int arr[]={1,2,3,4,5};
	System.out.println(arr[3]);
	System.out.println(arr[10]);
	
	}

	catch(java.lang.ArrayIndexOutOfBoundsException e) {
	
	System.out.println("Array Range is out of bounds");

	}

	System.out.println("Rest of the code is back");
}

}


		