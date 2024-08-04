package streamsdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> phrases = Arrays.asList("hello world", "java streams");
		
		List<String> words = phrases.stream().flatMap(phrase -> Arrays.stream(phrase.split(" ")))
						.collect(Collectors.toList());
		
		System.out.println(words);
		
		
	}

}
