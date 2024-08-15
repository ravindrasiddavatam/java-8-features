package streamsdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(19);
		list.add(23);
		list.add(32);
		list.add(30);
		
//		Stream<Integer>streamobject = list.stream();
//		Stream<Integer>filteredStream = streamobject.filter(x->x>=20);
//		Stream<Integer>sortedStream = filteredStream.sorted();
//		List<Integer>sortedList = sortedStream.collect(Collectors.toList());
//		System.out.println(sortedList);
		List<Integer>rawSorted = list.stream().sorted().collect(Collectors.toList());
		System.out.println(rawSorted);
		List<Integer>sorted = list.stream().filter(x->x>=20).sorted().collect(Collectors.toList());
		System.out.println(sorted);
	}

}
