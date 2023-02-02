import java.io.*;
class ThrowsKeyword {

	void m() throws IOException {

	throw new=IOException("Device Error");
	}

	}

	void n() throws IOException {

		m();
	}

	void p() throws IOException{

		try {

			n();
		}
		catch(Exception e) {

			System.out.println("Exception Handlied")
		
	}
	
	System.out.println("Normal Flow of Application");
	
	public static void main(String args[]) {

	ThrowsKeyword obj=new ThrowsKeyword();
	obj.p();

}

}


	

	