package staticVar_u_const_meth;

public class Student {
	static int CollegeCode;
	int sid;
	String sname;
	double sper;
	static String CollegeName;
	Student(int id,String name,double per){
		this.sid=id;
		this.sname=name;
		this.sper=per;
	}
	void StudentDetails(int cc,String cn) {
		this.CollegeCode=cc;
		this.CollegeName=cn;
		System.out.println("College Add :"+this.CollegeCode);
		System.out.println("College Name :"+this.CollegeName);
		System.out.println("Student id :"+this.sid);
		System.out.println("Student Name :"+this.sname);
		System.out.println("Student Persentage :"+this.sper);
		System.out.println("-----------------------------------------------------------------------------------------------------");
	}
}