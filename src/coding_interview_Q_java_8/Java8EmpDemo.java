package coding_interview_Q_java_8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8EmpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> emplist=new ArrayList<>();
		emplist.add(new Employee(1,500));
		emplist.add(new Employee(2,1000));
		emplist.add(new Employee(3,1500));
		emplist.add(new Employee(4,2000));
		emplist.add(new Employee(5,2500));
		emplist.add(new Employee(6,3000));
		
		List<Employee>empSortedList = emplist.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).collect(Collectors.toList());
		List<Employee>empSortedList1 = emplist.stream().sorted((o2,o1)->(int)(o1.getSalary()-o2.getSalary())).collect(Collectors.toList());
		List<Employee>empSortedList2 = emplist.stream().sorted((o2,o1)->(int)(o1.getSalary()-o2.getSalary()))
				                                       .limit(3)
				                                       .collect(Collectors.toList());
		//Employees sorted in desc order by their salary
		System.out.println(empSortedList);
		System.out.println(empSortedList1);
		//top 3 highest salaried employees
		System.out.println(empSortedList2);
		//employee whose salary is less than 3rd highest salary
		List<Employee>empSortedList3 = emplist.stream().sorted((o2,o1)->(int)(o1.getSalary()-o2.getSalary()))
                .skip(3)
                .collect(Collectors.toList());
		System.out.println(empSortedList3);
	}

}
