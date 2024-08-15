package streamsdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ToArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(23);
		list.add(34);
		
		Stream<Integer> streamOnject =list.stream();
		Object[] arr = streamOnject.toArray();
		for(Object i : arr) {
			System.out.println(i);
		}
		
		Object[] arr1 = list.stream().toArray();
		for(Object i : arr) {
			System.out.println(i);
		}

	}

}
