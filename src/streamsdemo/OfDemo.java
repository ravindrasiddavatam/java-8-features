package streamsdemo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream.of(1,11,111,1111).forEach(x->System.out.println(x));
		
		String[] arr = {"hello", "world", "America"};
		
		
//		List<String> answer = Stream.of(arr).filter(x->x.length()>=6).collect(Collectors.toList());
//		System.out.println(answer);
		Stream.of(arr).filter(x->x.length()>=6).forEach(x->System.out.println(x));

	}

}
