package sunmOfTheDigits;
import java.util.*;
public class sumOfTheDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for A");
		int a=sc.nextInt();
		int res=sumOfTheDigits(a);
		System.out.println(res+" is the sum of the given digit");
	}
	static int sumOfTheDigits(int num) {
		int lastDigit,sum=0;
		while(num>0) {
			lastDigit=num%10;
			sum=sum+lastDigit;
			num=num/10;
		}
		return sum;
	}
}