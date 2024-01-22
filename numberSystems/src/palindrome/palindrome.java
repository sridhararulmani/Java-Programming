package palindrome;
import java.util.*;
public class palindrome {
	static boolean isPalindrom(int n) {
		int rev=0,temp=n;
		while(n!=0) {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		return temp==rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for n");
		int n=sc.nextInt();
		boolean rs=isPalindrom(n);
		if(rs==true) {
			System.out.println("It is a Palindrome "+rs);
		}
		else {
			System.out.println("It is not a Palindrome "+rs);
		}
	}
}