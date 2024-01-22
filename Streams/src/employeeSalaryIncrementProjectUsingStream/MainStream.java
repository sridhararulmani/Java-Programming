package employeeSalaryIncrementProjectUsingStream;

import java.util.ArrayList;
import java.util.List;

public class MainStream {
	public static void main(String[] args) {
		List<Employee>elist=new ArrayList<Employee>();
		elist.add(new Employee(10, "Sridhar", 15000, "Soft ware"));
		elist.add(new Employee(12, "Ananya", 20000, "Soft ware"));
		elist.add(new Employee(13, "Sherin", 35000, "Analist"));
		elist.add(new Employee(11 ,"java", 10000,"HR"));
		elist.stream()
		.filter(Employee->Employee.getDept().equalsIgnoreCase("soft ware"))
		.forEach(Employee->Employee.setSalary(Employee.getSalary()*1.15));
		elist.forEach(System.out::println);
	}
}