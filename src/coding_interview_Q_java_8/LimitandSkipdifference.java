package coding_interview_Q_java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LimitandSkipdifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<Integer>list = new ArrayList<>();
		List<Integer>list = Arrays.asList(1,2,3,4,5,6,7);
		//list.stream().limit(3).forEach(x->System.out.println(x));
		list.stream().skip(4).forEach(x->System.out.println(x));
		
		

	}

}
