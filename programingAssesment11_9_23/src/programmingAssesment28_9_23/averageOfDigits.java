package programmingAssesment28_9_23;
import java.util.*;
public class averageOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the vale of a");
		int a=sc.nextInt();
		int res=avgOfDigits(a);
		System.out.println(res+" is the average of the digit");
	}
	static int avgOfDigits(int n) {
		int sum=0,count=0;
		if(n>=0) {
			n=n%10;
			sum=sum+n;
			n=n/10;
			count++;
		}
		return sum/count;
	}
}