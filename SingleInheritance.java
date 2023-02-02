//If you don't want other classes to inherit from a class, use the final keyword:


class Card {

	long cardNumber;
	int cvv;
	String name,expDate;
	double balance;
	void swipe() {

		System.out.println("Swipe the Card");
	}
}
class CreditCard extends Card {

	int creditLimit;
	void payBill() {

		System.out.println("Pay Credit Card Bill");
	}
}

class DebitCard extends Card {

	int balance;
}


class SingleInheritance {

	public static void main(String args[]) {
	CreditCard cc=new CreditCard();
	
	System.out.println(cc.balance=27000);
	System.out.println(cc.creditLimit=50000);
	System.out.println(cc.cardNumber=40768246834L);
	System.out.println(cc.cvv=143);
	System.out.println(cc.expDate="03/2027");
	System.out.println(cc.name="Rajesh");

	DebitCard dc=new DebitCard();
	System.out.println(dc.balance=250);
	cc.swipe();
	cc.payBill();
}
}



