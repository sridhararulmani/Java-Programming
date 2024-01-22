package programingAssesment12_9_23;
import java.util.Scanner;
public class smallestNumber {
	public static void main(String[] args) {
		int res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a=sc.nextInt();
		System.out.println("Enter the b value");
		int b=sc.nextInt();
		System.out.println("Enter the c value");
		int c=sc.nextInt();
		//res=(a<b)?a:b;
		//res=(res<c)?res:c;
		res=(a<b)?(a<c)?a:c:(b<c)?b:c;
		System.out.println(res);
	}
}