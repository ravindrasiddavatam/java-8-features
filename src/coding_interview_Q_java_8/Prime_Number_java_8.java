package coding_interview_Q_java_8;

import java.util.stream.IntStream;

public class Prime_Number_java_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPrime(7));
		

	}
	
	public static boolean isPrime(int number) {
		boolean isDivisible = false;
		
//		for(int i=2; i<number;i++) {
//			if(number%i == 0) {
//				isDivisible = true;
//				break;
//			}
//		}
		return number>1&& IntStream.range(2, number).noneMatch(n->number%n==0);
	}

}
