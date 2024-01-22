package programingAssesment12_9_23;
import java.util.Scanner;
public class digitOrNot {
	public static void main(String[] args) {
		String res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int a=sc.nextInt();
		res=(a/10==0)?"digit":"number";
		System.out.println(res);
	}
}