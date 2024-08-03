import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ConsumerDemo cd=new ConsumerDemo();
//		cd.squareMe(5);
		
		Consumer<Integer> squareMe = x -> System.out.println(x*x);
		squareMe.accept(5);
		
		Consumer<String> c1 = x -> System.out.println(x.length());
		c1.accept("hello");
		
		Consumer<Integer> doubleMe = x -> System.out.println(x*2);
		doubleMe.accept(2);
		
		squareMe.andThen(doubleMe).accept(2);
	}
	
//	private void squareMe(int x) {
//		int square = x*x;
//		System.out.println(square);
//	}

}
