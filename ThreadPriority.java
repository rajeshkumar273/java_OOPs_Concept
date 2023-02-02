class FirstThread extends Thread {

	int count=0;

	public void run() {

		for(int i=1;i<=10000;i++) {

		count++;

		System.out.println("Thread 1 Started Counting...");
		System.out.println("Completed Counting from 1 to 1000 by"+Thread.currentThread().getName()+"Thread");

		System.out.println("Priority of"+Thread.currentThread().getName()+"Thread is:"+Thread.currentThread().getPriority());

		}

	}

}

class SecondThread extends Thread {

	int count=0;

	public void run() {

		for(int j=1;j<=10000;j++) {

		count++;

		System.out.println("Thread 2 Started Counting...");
		System.out.println("Completed Counting from 1 to 1000 by"+Thread.currentThread().getName()+"Thread");

		System.out.println("Priority of"+Thread.currentThread().getName()+"Thread is:"+Thread.currentThread().getPriority());

		}

	}

}

public class ThreadPriority {

	public static void main(String args[]) {

	FirstThread obj1=new FirstThread();
	SecondThread obj2=new SecondThread();

	Thread t1=new Thread(obj1,"First");
	Thread t2=new Thread(obj2,"Second");
	
	t1.setPriority(3);
	t2.setPriority(8);
	
	t1.start();
	t2.start(); 

}

}

	
