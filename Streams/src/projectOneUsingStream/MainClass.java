package projectOneUsingStream;

import java.util.Comparator;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

public class MainClass {
	public static void main(String[] args) {

		Set<Student>set=new TreeSet<Student>(Comparator.comparingInt(Student::getId));

		set.add(new Student(124, "Sridhar", 8.2, "Full-Strack"));
		set.add(new Student(123, "Ananya", 9.9, "Full-Strack"));
		set.add(new Student(114, "Sherin", 10.0, "Full-Strack"));
		set.add(new Student(424, "Dhanya", 7.2, "Mern-Strack"));
		
//		set.stream()
//		.sorted(Comparator.comparingDouble(Student::getPer)
//				.reversed())
//		.forEach(System.out::println);
		
		Student highPersentage=set.stream()
				.max(Comparator.comparingDouble(Student::getPer))
				.get();
		System.out.println(highPersentage);
		
		
	}
}