package returnPrograms1;

public class add {
	int addd(){
		return 10+20+40+80;
	}
	public static void main(String[] args) {
		add a=new add();
		int m=a.addd();
		System.out.println(m);
	}
}