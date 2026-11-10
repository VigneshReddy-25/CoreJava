package threads;

class MyRunnable implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Runnable Thread: "+i);
		}
	}
}

public class RunnableDemo {

	public static void main(String args[]) {
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(mr);
		t1.start();
	}
}
