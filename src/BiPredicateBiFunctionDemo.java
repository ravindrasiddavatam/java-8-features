import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateBiFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiPredicate<Integer,Integer> bipredicate = (a,b)->a+b>=5;
		System.out.println(bipredicate.test(10, 12));
		
		BiFunction<Integer,Integer,Integer> biFunction = (a,b)->a*b;
		System.out.println(biFunction.apply(3, 3));
	}

}
