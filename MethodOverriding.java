class RBI 
{
int getInterestRate() {

	return 0;
}
 

}

class SBI extends RBI {
	
	@Override
	int getInterestRate() {
		return 8;

	}

}

class Axis extends RBI {
	
	@Override
	int getInterestRate() {
		return 10;

	}
}

class ICCI extends RBI {

	@Override
	int getInterestRate() {

		return 6;
	}
}


class MethodOverriding {

	public static void main(String args[] ) {
		SBI s=new SBI();
		Axis a=new Axis();
		ICCI i=new ICCI();
	
		System.out.println("State Bank Interest: "+s.getInterestRate());
		System.out.println("AXIS Bank Interest: "+a.getInterestRate());
		System.out.println("ICCI Bank Interest: "+i.getInterestRate());
		}
}





