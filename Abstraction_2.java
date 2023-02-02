abstract class RBI {

	abstract int getRateOfInterest();
}


class SBI extends RBI {

	int getRateOfInterest() {
		 return 7;
	}

}

class PNB extends RBI {

	int getRateOfInterest() {

		return 6;
	}

}

class HDFC extends RBI {

	int getRateOfInterest() {

		return 10;
	}

}

class Abstraction_2 {

	public static void main(String args[]) {

		/*RBI r=new SBI();
		  RBI r1=new PNB();
		  RBI r2=new HDFC(); 

		System.out.println("SBI Rate of Interest:"+r.getRateOfInterest());
		System.out.println("PNB Rate of Interest:"+r1.getRateOfInterest());
		System.out.println("HDFC Rate of Interest:"+r2.getRateOfInterest());

		*/

		RBI r;
		
		r=new SBI();
			System.out.println("SBI Rate of Interest:"+r.getRateOfInterest());

		r=new PNB();
			System.out.println("PNB Rate of Interest:"+r.getRateOfInterest());
		r=new HDFC();
			System.out.println("HDFC Rate of Interest:"+r.getRateOfInterest());

		

		
}

}

		