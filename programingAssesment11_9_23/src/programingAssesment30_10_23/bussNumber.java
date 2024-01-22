package programingAssesment30_10_23;
import java.util.Scanner;
public class bussNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the vale to find");
		int a=sc.nextInt();
		boolean res=isBuzzOrNot(a);
		if(res) {
			System.out.println(a+" is a Buss Number");
		}
		else {
			System.out.println(a+" is not a Buss Number");
		}
	}
	static boolean isBuzzOrNot(int num) {
		int n=num,d;
		n=n%7;
		d=num%10;
		if(n==0||d==7) {
			return true;
		}
		else {
			return false;
		}
	}
}
