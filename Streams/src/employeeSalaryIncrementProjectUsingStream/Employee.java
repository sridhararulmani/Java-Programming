package employeeSalaryIncrementProjectUsingStream;

public class Employee {
	int id;
	String name;
	double salary;
	String dept;
	Employee(int id,String name,double salary,String dept){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public String getDept() {
		return dept;
	}
	@Override
	public String toString() {
		return "Name :"+name+" ID :"+id+" Salary :"+salary+" Dept :"+dept;
	}
	public void setSalary(double sal) {
		this.salary=sal;
	}
}