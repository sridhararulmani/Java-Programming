package methodOverLoading1;

public class methods {
	static void m1() {
		System.out.println("method starts");
	}
	static void m1(String n,int num) 
	{
		System.out.println(n+num);
	}
	static void m1(int num,String n) {
		System.out.println(n+num);
	}
	static void m1(long number,float per) {
		System.out.println(number+" "+per);
	}
	static int m1(int num,long number) {
		System.out.println(number);
		return num;
	}
	static float m1(int num,float per) {
		System.out.println(num);
		return per;
	}
	{
		System.out.println("method ends");
	}
}