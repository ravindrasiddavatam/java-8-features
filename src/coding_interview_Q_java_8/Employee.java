package coding_interview_Q_java_8;

public class Employee {

	private int id;
	private long salary;
	
	public Employee(int id, long salary) {
		this.id = id;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return "[id = "+ id +" ,salary= "+ salary + " ]";
	}
}
