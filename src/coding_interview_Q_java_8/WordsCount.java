package coding_interview_Q_java_8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Welcome to Code decode and Code decode welcomes you";
		
		List<String> list = Arrays.asList(str.split(" "));
		
		//System.out.println(list);
		Map<String, Long>map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
//		Function<String,String> fn = Function.identity();
//		System.out.println(fn.apply("hello"));
		
		
	}

}
