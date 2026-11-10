package threads;

//class ThreadCon {
//	public void run() {
//		for(int i=0;i<5;i++) {
//			System.out.println("Thread: "+i);
//		}
//	}
//}

public class ThreadConstructor {
	public static void main(String args[]) {
		Thread t1 = new Thread("Start thread");
		t1.start();
		System.out.println(t1.getName()); 
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread: "+i);
		}
	}
}
