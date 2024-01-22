package programmingAssesment28_9_23;
import java.util.Scanner;
public class evenDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the vale for A");
		int a=sc.nextInt();
		int res=evenDigit(a);
		System.out.println(res+" Total number of even Digits in the given Number");
	}
	static int evenDigit(int n) {
		int count=0,d;
		do {
			d=n%10;
			n=n/10;
			if(d%2==0) {
				count++;
				System.out.println(d+" is an even number");
			}
		}
		while(n!=0);
		return count;
	}
}