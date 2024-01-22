package printAreaAndPerimerter;
import java.util.Scanner;
public class aAndB {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A");
		int a=sc.nextInt();
		System.out.println("Enter the value of B");
		int b=sc.nextInt();
		int val=(a*a)+(b*b)+(2*a)+(2*b);
		System.out.println(val);
	}
}