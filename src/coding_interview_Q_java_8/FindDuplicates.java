package coding_interview_Q_java_8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(10,28,87,10,28,34,45,67,87,87,87,87);
		Set<Integer> set = new HashSet<>();
		//list.stream().filter(x->!set.add(x)).forEach(x->System.out.println(x));
		list.stream().filter(x->!set.add(x)).collect(Collectors.toSet()).forEach(x->System.out.println(x));
		
		

	}

}
