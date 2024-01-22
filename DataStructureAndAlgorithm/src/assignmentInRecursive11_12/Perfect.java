package assignmentInRecursive11_12;
import java.util.Scanner;
public class Perfect {
	public static boolean isPerfect(int dig) {
		return isPerfect(dig,0,1);
	}
	public static boolean isPerfect(int dig ,int sum, int d) {
		if(d>dig/2) {
			return sum==dig;
		}
		if(dig%d==0) {
			sum=sum+d;
		}
		return isPerfect(dig,sum,d+1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner( System.in);
		System.out.println("Enter the Digit");
		int dig=sc.nextInt();
		boolean res=isPerfect(dig);
		if(res) {
			System.out.println("is Perfect Number");
		}
		else {
			System.out.println("Not a Perfect Number");
		}
	}
}