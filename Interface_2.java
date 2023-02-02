interface RegulatorInf {

	void increaseSpeed();
	void reduceSpeed();
}

interface Iswitch {

	void switchOff();
	void switchOn();
}


class FanImpl implements RegulatorInf,Iswitch {

	@Override
	public void increaseSpeed() {
		System.out.println("Increase Speed ");
	}

	@Override 
	public void reduceSpeed() {

		System.out.println("Reduce Speed");
	}

	@Override 
	public void switchOn() {

		System.out.println("Switch On");
	}

	@Override 
	public void switchOff() {

		System.out.println("Switch Off");
	}

}

class Interface_2 {

	public static void main(String args[] ) {
	
	RegulatorInf r=new FanImpl();
	r.increaseSpeed();
	r.reduceSpeed();
	
	Iswitch s=new FanImpl();
	s.switchOn();
	s.switchOff();
}

}


	