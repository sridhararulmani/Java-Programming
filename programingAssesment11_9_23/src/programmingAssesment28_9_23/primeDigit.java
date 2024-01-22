package programmingAssesment28_9_23;
import java.util.*;
public class primeDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int num=sc.nextInt();
		int res=primeDigits(num);
		System.out.println(res+" total number of the prime number");
	}
	static int primeDigits(int n) {
		int count=0,d=0;
		do {
			for(int i=2;i<9;i++) {
				d=n%10;
				if(d%i==0) {
					count++;
					System.out.println(d);
				}
				n=n/10;
			}
		}
		while(n!=0);
		return count;
	}
}