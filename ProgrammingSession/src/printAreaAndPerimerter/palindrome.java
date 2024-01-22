package printAreaAndPerimerter;
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int a=sc.nextInt();
		int temp=a,rev=0,rem=0;
		while(a>0) {
			int r=a%10;
			rev=rev*10+r;
			a=a/10;
		}
		if(rev==temp) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
	}
}