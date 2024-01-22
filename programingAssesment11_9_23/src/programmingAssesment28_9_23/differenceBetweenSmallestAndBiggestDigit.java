package programmingAssesment28_9_23;
import java.util.*;
public class differenceBetweenSmallestAndBiggestDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int a=sc.nextInt();
		int s=small(a);
		int b=bigg(a);
		System.out.println(s-b+" is the difference between the smalest and bigest number");
	}
	static int small(int n) {
		int small=0;
		do {
			int d=n%10;
			if(d<small) {
				small=d;
			}
			n=n/10;
		}
		while(n!=0);
		return small;
	}
	static int bigg(int n) {
		int large=-9;
		while(n>0) {
			int rem=n%10;
			if(rem>large) {
				large=rem;
			}
		}
		return large;
	}
}