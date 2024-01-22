package programingAssesment12_9_23;
import java.util.*;
public class biggestDoubleNumber {
	public static void main(String[] args) {
		double res;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the A value");
		double a=sc.nextDouble();
		System.out.println("enter the b value");
		double b=sc.nextDouble();
		System.out.println("enter the c value");
		double c=sc.nextDouble();
		//res=(a>b)?a:b;
		//res=(res>c)?res:b;
		res=(a>b)?(a>c)?a:c:(b>c)?b:c;
		System.out.println(res);
	}
}