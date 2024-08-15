package stream_advancedLevel;

import java.util.Arrays;
import java.util.List;

public class Intermediateshortcircuitingmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("a", "b","c","d","e","a");
//		list.stream().limit(2).forEach(System.out::println);
//		
		//list.stream().distinct().forEach(System.out::println);
		
		list.stream().skip(10).forEach(System.out::println);

	}

}


//In Java 8, intermediate operations on streams can be either stateful or stateless. Some intermediate operations can also be short-circuiting, meaning they can produce a result without examining all the elements of the stream. Here are the intermediate short-circuiting methods introduced in Java 8:
//
//limit(long maxSize):
//
//This method returns a stream consisting of the elements of the original stream, truncated to be no longer than the specified maxSize.
//Short-circuits when the specified number of elements has been reached.
//java
//Copy code
//List<String> list = Arrays.asList("a", "b", "c", "d");
//list.stream()
//    .limit(2)
//    .forEach(System.out::println); // Output: a, b
//distinct():
//
//This method returns a stream consisting of the distinct elements of the original stream. It uses the equals() method to determine equality.
//While distinct() can potentially consume the entire stream to find unique elements, it can also be considered short-circuiting because it may finish early if it has collected all distinct elements before the end of the stream.
//java
//Copy code
//List<String> list = Arrays.asList("a", "b", "a", "c");
//list.stream()
//    .distinct()
//    .forEach(System.out::println); // Output: a, b, c
//skip(long n):
//
//This method returns a stream that discards the first n elements of the original stream. If the stream contains fewer than n elements, an empty stream is returned.
//Short-circuits by skipping the specified number of elements.
//java
//Copy code
//List<String> list = Arrays.asList("a", "b", "c", "d");
//list.stream()
//    .skip(2)
//    .forEach(System.out::println); // Output: c, d
//While these methods have short-circuiting behavior in certain contexts, it's important to note that short-circuiting in streams is more commonly associated with terminal operations like findFirst(), findAny(), and anyMatch(). These terminal operations can complete their operation without processing all elements of the stream, based on specific conditions.
