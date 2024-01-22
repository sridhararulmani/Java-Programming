package initializeVariableIN_object;

public class Student {
	String name;
	int rollnum;
	int count=1;
	void std(String n,int rn) {
		this.name=n;
		this.rollnum=rn;
		System.out.print(count+"-Student name :"+this.name);
		System.out.print("   "+"Student rollnum :"+this.rollnum);
		System.out.println();
		count++;
	}
}