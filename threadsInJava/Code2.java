package threadsInJava;

class Worker1 implements Runnable{
	public void run() {
//		System.out.println("Hi!, I am Thread");
		for(int i=0;i<=20;i++) {
			System.out.println("Thread 1 is running......");
			try {
				Thread.sleep(1000);  //in ms
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
}
}
	
class Worker2 implements Runnable{
	public void run() {
//		System.out.println("Hi!, I am Thread");
		for(int i=0;i<=10;i++) {
			System.out.println("Thread 2 is running......");
			try {
				Thread.sleep(1000);  //in ms
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
}
}
public class Code2 {
	public static void main(String[] args) {
		Worker1 worker1= new Worker1();
		Worker2 worker2= new Worker2();
		Thread t1 = new Thread(worker1);
		Thread t2= new Thread(worker2);
		
		t1.setPriority(5);
		t2.setPriority(10);
		
		t1.start();
		t2.start();
	}
}
