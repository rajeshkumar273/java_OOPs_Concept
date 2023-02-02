//Extending Thread Class


/*
class MultiThreading extends Thread //start
{

public void run() {

	System.out.println("Thread1");
}

public static void main(String args[]) {

	MultiThreading mt=new MultiThreading();
	mt.start();
	}
}

*/


class MultiThreading implements Runnable {

	public void run() {

		System.out.println("Thread 2");
	}

	public static void main(String args[]) {

	MultiThreading obj=new MultiThreading();
	Thread t=new Thread(obj); //sending obj reference to the object t

	t.start();
}

}

	