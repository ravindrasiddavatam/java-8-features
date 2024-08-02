import java.util.function.Predicate;

public class PredicateFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PredicateFunctionDemo demo =new PredicateFunctionDemo();
		
	
	//Functional Interface reference will be used to hold the Lamda Expression
	Predicate<String> predicate = s -> s.length() > 5;
	System.out.println(predicate.test("hello world"));
	
	
//	public boolean length(String s) {
//		if(s.length() > 5) {
//			return true;
//		}else {
//			return false;
//		}
	}

}
