package streamProcessingWeek3;

interface mathx{
	void add(int n1, int n2);
}

class p1 implements mathx{
	public void add(int n1, int n2) {
		System.out.println(n1+n2);
	}
}
public class Code3 {
	public static void main(String[] args) {
		p1 p1 = new p1();
		p1.add(10,20);
		
		
//		Lambda Expression
//		Lambda Expression me interface functional interface hona chahiye i.e. one method(abstract)
		mathx obj=(int x, int y)->{
			System.out.println(x+y);
		};
		
		obj.add(40,500);
	}
}
