import java.util.function.Predicate;

public class PredicateJoining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<String> checkLength = s -> s.length() > 5;
		System.out.println(checkLength.test("world hello"));
		
		Predicate<String> checkEvenLength = s -> s.length() % 2 == 0;
		
		System.out.println(checkEvenLength.test("hello"));
		
		System.out.println(checkLength.and(checkEvenLength).test("hello world"));
		
		System.out.println(checkLength.or(checkEvenLength).test("code decode"));
		
		System.out.println(checkLength.negate().test("code decode"));	

	}

}
