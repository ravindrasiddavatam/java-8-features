package stream_advancedLevel;

import java.util.Arrays;
import java.util.List;

public class TerminalvsIntermediateOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(1, "Kunal");
		Employee e2 = new Employee(2, "Striver");
		Employee e3 = new Employee(3, "Naveen");
		Employee e4 = new Employee(4, "Amigos");
		
		List<Employee> employee = Arrays.asList(e1,e2,e3,e4);
		List<Integer> intlist = Arrays.asList(1,2,3,4,5,6);
		
		intlist.stream().filter(a -> a%2 ==0).map(a -> a+a).filter(a -> a>5).forEach(a ->System.out.println(a));
		System.out.println(intlist.stream().filter(a -> a%2 ==0).map(a -> a+a).filter(a -> a>5).count());
		
	}
}

class Employee {
	
	private int id;
	private String name;
	
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		 this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		 this.name = name;
	}
	
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	public void printName() {
		System.out.println("In Emp class "+name);
	}
	
}
