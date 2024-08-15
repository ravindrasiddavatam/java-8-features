package stream_advancedLevel;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Terminalshortcircuitingmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List<Integer> list = Arrays.asList(2,4,6);
//		
//		// anyMatch(Predicate<? super T> predicate):
//		boolean hasEven = list.stream().anyMatch(x->x%2==0);
//		System.out.println(hasEven);
//		
//		// allMatch(Predicate<? super T> predicate):
//		
//		boolean allEven = list.stream().allMatch(x->x%2==0);
//		System.out.println(allEven);
//		
//		// noneMatch(Predicate<? super T> predicate):
//		
//		boolean noneEven = list.stream().noneMatch(x->x%2==0);
//		System.out.println(noneEven);
		
		// findFirst():
		
		List<String> list1 = Arrays.asList("a","b","c");
		Optional<String> first =list1.stream().findFirst();
		System.out.println(first);
		
		System.out.println(list1.stream().findAny());
		
		
	}

}
