package coding_interview_Q_java_8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class sqrt_of_10_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List<Double> sqrt10prime = new ArrayList<Double>(10);
//		
//		int index = 1;
//		
//		while(sqrt10prime.size()<10) {
//			if(isPrime(index)) {
//				sqrt10prime.add(Math.sqrt(index));
//			}
//			index++;
//		}
//		System.out.println(sqrt10prime);
//
//	}
		
		List<Double> sqrt10prime = Stream.iterate(1, i->i+1)
										 .filter(sqrt_of_10_prime::isPrime).peek(x->System.out.println(x))
										 .map(Math::sqrt)
										 .limit(10)
										 .collect(Collectors.toList());
		System.out.println(sqrt10prime);
	}
			
	
	public static boolean isPrime(int number) {
		return number>1&& IntStream.range(2, number).noneMatch(n->number%n==0);
	}

}
