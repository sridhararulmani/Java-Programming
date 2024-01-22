package initailizeVarIn_method;

public class driver {
	String name;
	driver(String nm){
		this.name=nm;	
	}
	void drive() {
		System.out.println(this.name+" Driving");
	}
	public static void main (String [] args) {
		driver d1=new driver("mannu");
		d1.drive();
		driver d2=new driver("kannu");
		d2.drive();
	}
}