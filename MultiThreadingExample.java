class Thread1 extends Thread
{

public void run() {

	for(int i=0;i<5;i++) {

		System.out.println("From Thread 1: "+i);

	}

}

}

class Thread2 extends Thread {

	public void run() {

		for(int j=0;j<5;j++) {


			System.out.println("From Thread 2: "+j);
		}

	}

}


class MultiThreadingExample {

	public static void main(String args[]) {

	Thread1 t1=new Thread1();
	Thread2 t2=new Thread2();

	t1.start();
	t2.start();

}

}
