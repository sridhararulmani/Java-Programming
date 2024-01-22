package datasFile;

public class dataBaseFormate {
	public String name;
	public int age;
	public double salary;
	public long mobileNumber;
	dataBaseFormate(String n,int a,double sal,long mN){
		this.age=a;
		this.name=n;
		this.salary=sal;
		this.mobileNumber=mN;
	}
	void print() {
		System.out.println("Profile Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Salary :"+salary);
		System.out.println("Mobile NUmber :"+mobileNumber);
	}
	public static void main(String[] args) {
		ProfileData p1=new dataBaseFormate("Sridhar",21,2500,9384975226l);
	}
}