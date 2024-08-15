package streamsdemo;

import java.util.ArrayList;
import java.util.List;

public class MinMaxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(24);
		list.add(35);
		
		Integer result = list.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(result);
		
		Integer result1 =list.stream().min((i1,i2)->i2.compareTo(i1)).get();
		System.out.println(result1);

	}

}
