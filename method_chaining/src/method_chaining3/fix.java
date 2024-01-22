package method_chaining3;

public class fix {
	void repair() {
		puncher p=new puncher();
		p.wheel();
		System.out.println("Bike is repaired fully");
	}
	public static void main(String [] args) {
		fix f=new fix();
		f.repair();
		System.out.println("bike will ready to drive");
	}
}
