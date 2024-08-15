package streamsdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(13);
		list.add(25);
		list.add(29);
		
//		Stream<Integer> st =list.stream();
//		Stream<Integer> st1=st.filter(x->x>=20);
//		List<Integer>list1=st1.collect(Collectors.toList());
//		System.out.println(list1);
		
		List<Integer>result = list.stream().filter(x->x>=20).collect(Collectors.toList());
		System.out.println(result);

	}

}
