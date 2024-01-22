package multipleRefernseVariables1;

public class pen {
	public static void main(String[] args) {
		pen p1=new pen();
		pen p2=p1;
		pen p3=p2;
		pen p4=p3;
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}
}