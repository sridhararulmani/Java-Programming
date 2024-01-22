package programingAssesment30_10_23;
import java.util.Scanner;
public class duckNumberOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the vale to find");
		int a=sc.nextInt();
		boolean res=isDuckNumberOrNot(a);
		if(res==true) {
			System.out.println(a+" is a Duck Number");
		}
		else {
			System.out.println(a+" is not a Duck Number");
		}
	}
	static boolean isDuckNumberOrNot(int num) {
		int n=num;
		while(n!=0) {
			int d=n%10;
			n=n/10;
			if(d==0) {
				return true;
			}
		}
		return false;
	}
}
