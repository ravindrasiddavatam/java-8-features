package streamsdemo;

import java.util.ArrayList;
import java.util.List;

public class CountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(29);
		list.add(32);
		
		long rawcount=list.stream().count();
		long n=list.stream().filter(x->x>=20).count();
		System.out.println(n);
		System.out.println(rawcount);
	}

}
