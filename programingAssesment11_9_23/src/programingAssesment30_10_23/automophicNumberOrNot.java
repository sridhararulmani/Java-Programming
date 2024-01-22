package programingAssesment30_10_23;
import java.util.Scanner;
public class automophicNumberOrNot {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number to find");
		int a=sc.nextInt();
		boolean res=isAutomphicNumberOrNot(a);
		if(res) {
			System.out.println(a+" is an Automphic Number");
		}
		else{
			System.out.println(a+" is not a Automphic Number");
		}

	}
	static boolean isAutomphicNumberOrNot(int num) {
		int n=num,sq=n*n,d=sq%10;
		if(n==d) {
			return true;
		}
		else {
			return false;
		}
	}
}