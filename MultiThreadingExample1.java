class Thread1 implements Runnable {

	public void run() {

		for(int i=0;i<5;i++) {

			System.out.println("From Thread1: "+i);
		}

	}

}

class Thread2 implements Runnable {

	public void run() {

		for(int j=0; j<5;j++) {

			System.out.println("From Thread2: "+j);
		}

	}

}


class MultiThreadingExample1 {

	public static void main(String args[]) {

	Thread1 obj1=new Thread1();
	Thread2 obj2=new Thread2();

	Thread t1=new Thread(obj1);
	Thread t2=new Thread(obj2);
	t1.start();
	t2.start();

}

}


