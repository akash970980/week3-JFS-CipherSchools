package threadsInJava;

class Worker extends Thread{
//	run is predefined method when a thread is started,
//	it automatically looks for run method
//	The job of thread is defined inside run method.
	
	
	public void run() {
//		System.out.println("Hi!, I am Thread");
		for(int i=0;i<=10;i++) {
			System.out.println("Thread 1 is running......"+ new java.util.Date());
			try {
				Thread.sleep(1000);  //in ms
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}

public class Code1 {
	public static void main(String[] args) {
		Worker w1 = new Worker();
		w1.start();
//		start method used to start thread, which indirectly calls run() method
		
	}
}
