package staticVar_u_const_meth;
//values declear in method and constructor at a time
public class StudentTest {
	public static void main(String[] args) {
		Student s1=new Student(001,"SRI",78.34);
		Student s2=new Student(002,"Ananya",98.77);
		Student s3=new Student(003,"jyothi",87.57);
		Student s4=new Student(004,"pramod",99.99);
		s1.StudentDetails(2213,"MEC");
		s2.StudentDetails(2213,"MEC");
		s3.StudentDetails(4456,"MIT");
	}
}
