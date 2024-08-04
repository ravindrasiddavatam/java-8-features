package streamsdemo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(25);
		list.add(30);
		
		List<Integer> newal = new ArrayList<>();
		
		newal = list.stream().filter(x -> x>=15).collect(Collectors.toList());
		newal.stream().forEach(x -> System.out.println(x));
		
		
//	//without streams
//		
//	List<Integer> arlist = elements(list); 
//	
//	for(Integer i:arlist) {
//		System.out.println(i);
//	}
//	}
//	
//	
//	public static List<Integer> elements(List<Integer> list) {
//		
//		List<Integer> list1 = new ArrayList<>();
//		
//		for(Integer i : list) {
//			if(i >= 15) {
//				list1.add(i);
//			}
//		}
//		return list1;
//	}
	
	}

}
