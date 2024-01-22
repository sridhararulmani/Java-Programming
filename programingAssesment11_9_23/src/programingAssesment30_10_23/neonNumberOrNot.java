package programingAssesment30_10_23;
import java.util.Scanner;
public class neonNumberOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value to find");
		int a=sc.nextInt();
		boolean res=isNeonOrNot(a);
		if(res==true) {
			System.out.println(a+" is a Neon Number");
		}
		else {
			System.out.println(a+" is not a Neon Number");
		}
	}
	static boolean isNeonOrNot(int num) {
		int n=num*num,sum=0;
		do {
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}while(n!=0);
		return num==sum;
	}
}