package perfectNumber;
import java.util.*;
public class perfect {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value for N");
		int n=sc.nextInt();
		boolean res=perfectNumber(n);
		if(res==true) {
			System.out.println(n+" is Perfect Number");
		}
		else {
			System.out.println(n+" is not a Perfect Number");
		}
	}
	static boolean perfectNumber(int num) {
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(num==sum) {
			return true;
		}
		else {
			return false;
		}
	}
}