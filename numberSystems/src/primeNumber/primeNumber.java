package primeNumber;
import java.util.*;
public class primeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for a");
		int a=sc.nextInt();
		boolean res=prime(a);
		if(res==true) {
			System.out.println(a+" is a Prime Number");
		}
		else {
			System.out.println(a+" is not a Prime NUmber");
		}
	}
	static boolean prime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}