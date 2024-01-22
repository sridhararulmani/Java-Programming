package programmingAssesment28_9_23;
import java.util.*;
public class strongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter teh value for n");
		int a=sc.nextInt();
		boolean res=isStrong(a);
		if(res==true) {
			System.out.println("the given number is Strong");
		}
		else {
			System.out.println("the given number is not Strong");
		}
	}
		static boolean isStrong(int x) {
			int sum=0,temp=x;
			do{
				int d=x%10;
				sum=sum+fact(d);
				x=x/10;
			}while(x!=0);
			return temp==sum;
		}
		static int fact(int n) {
			
			int fact=n;
			while(n>1) {
				fact=fact*n;
				n--;
			}
			return fact;
		}
}