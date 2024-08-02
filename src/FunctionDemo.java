import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		FunctionDemo demo= new FunctionDemo();
//		demo.squareNumber(5);
		
		//Input Argument,Return Type
		Function<Integer,Integer> squareMe = i -> i*i;
		System.out.println(squareMe.apply(5));
		
		Function<Integer,Integer> cubeMe = i -> i*i*i;
		System.out.println(cubeMe.apply(2));
		
		System.out.println(squareMe.andThen(cubeMe).apply(2)); // First squareMe and later cubeMe
		System.out.println(squareMe.compose(cubeMe).apply(3)); // First cubeMe and later squareMe
		
	}
	
//	public int squareNumber(int n) {
//		int i =n*n;
//		return i;
//	}

}
