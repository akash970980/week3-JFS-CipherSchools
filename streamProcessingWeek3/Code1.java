package streamProcessingWeek3;


import java.util.ArrayList;

public class Code1 {
//	For Each - this method helps us in accessing all the elements of a given collection and call a common method on all functions
//	Stream is a wrapper around your data source 
//	So that we can do the bulk processing conveniently and fast
	
	public static void main(String[] args) {
		ArrayList<String> lang = new ArrayList<>();
		
		lang.add("Java");
		lang.add("CSharp");
		lang.add("Python");
		lang.add("PHP");
//		lang.forEach(class::method)
		lang.forEach(System.out::println);
	}
	
	
	
}
