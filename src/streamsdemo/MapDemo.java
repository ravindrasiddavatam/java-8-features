package streamsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arlist = new ArrayList<>();
		arlist.add(10);
		arlist.add(12);
		arlist.add(77);
		
//		Stream s=arlist.stream().map(x -> x*x);
//		s.forEach(x -> System.out.println(x));
		
		arlist.stream().map(x -> x*x).forEach(x -> System.out.println(x));
		
		List<String> words=Arrays.asList("hello", "world");
		
		List<Integer> wordsLength = words.stream().map(String::length).collect(Collectors.toList());
		System.out.println(wordsLength);

	}

}
