package programingAssesment30_10_23;
import java.util.Scanner;
public class strongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean res=isStong(n);
		if(res==true) {
			System.out.println("the given number is Strong");
		}
		else {
			System.out.println("the given number is not a Strong number");
		}
	}
	static boolean isStong(int n) {
		int sum=0,temp=n;
		do{
			int r=n%10;
			sum=sum+fact(r);
			n=n/10;
		}while(n!=0);
		return temp==sum;
	}
	static int fact(int i) {
		int pw=1;
		while(i>1) {
			pw=pw*i;
			i--;
		}
		return pw;
	}

}