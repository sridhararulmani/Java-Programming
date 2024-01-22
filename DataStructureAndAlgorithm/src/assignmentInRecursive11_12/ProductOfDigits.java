package assignmentInRecursive11_12;
import java.util.Scanner;
public class ProductOfDigits {
	static int productOfDigit(int n) {
		if(n==1) {
			return 1;
		}
		return n%10*productOfDigit(n/10);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Digit");
		int num=sc.nextInt();
		int product=productOfDigit(num);
		System.out.println(product);
	}
}
