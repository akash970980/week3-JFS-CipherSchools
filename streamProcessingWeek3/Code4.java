package streamProcessingWeek3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//	Map : used to implement same function on all elements present
//	Filter : used to extract subset from data(based on condition)
public class Code4 {
	public static void main(String[] args) {
		List<Integer> numbers= Arrays.asList(10,20,-30,-40,50,60,-70);
		List<Integer> result= numbers.stream().filter(e-> e<0).collect(Collectors.toList());
		System.out.print("Negative Numbers are : ");
		System.out.println(result);
		
		
		List<Integer> resultEven= numbers.stream().filter(e-> (e%2==0)).collect(Collectors.toList());
		System.out.print("Even Numbers are : ");
		System.out.println(resultEven);
		
	}
}
