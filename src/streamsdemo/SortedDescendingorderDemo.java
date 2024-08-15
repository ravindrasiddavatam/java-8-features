package streamsdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedDescendingorderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(23);
		list.add(35);
		
		Stream<Integer>streamObject = list.stream();
		Stream<Integer> filteredStream = streamObject.filter(x->x>=20);
		Stream<Integer> sortedStream = filteredStream.sorted((i1,i2) -> i2.compareTo(i1));
		System.out.println(sortedStream);
		sortedStream.forEach(x->System.out.println(x));
		
		List<Integer> answer = list.stream().sorted((i1,i2) -> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(answer);
		
		
		

	}

}
