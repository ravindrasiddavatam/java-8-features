package streamsdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arlist = new ArrayList<>();
		arlist.add(10);
		arlist.add(12);
		arlist.add(77);
		
//		Stream s=arlist.stream().filter(x -> x%2==0);
//		s.forEach(x -> System.out.println(x));
		
		arlist.stream().filter(x -> x%2==0).forEach(x -> System.out.println(x));

	}

}
