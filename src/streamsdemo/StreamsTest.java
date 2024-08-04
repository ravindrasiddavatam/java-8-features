package streamsdemo;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(12,14,2,3,4,5,6,7,8,9,10,10);
		List<Integer>list1= list.stream().filter(x -> x%2 ==0).map(x -> x/2).collect(Collectors.toList());
		System.out.println(list1);
		
		List<Integer>list2= list.stream().
				filter(x -> x%2 ==0)
				.map(x -> x/2)
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(list2);
		
		List<Integer>list3= list.stream().
				filter(x -> x%2 ==0)
				.map(x -> x/2)
				.distinct()
				.sorted((a,b) -> (b - a))
				.collect(Collectors.toList());
		System.out.println(list3);
		
		

	}

}
