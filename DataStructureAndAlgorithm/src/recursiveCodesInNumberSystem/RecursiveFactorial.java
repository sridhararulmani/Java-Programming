package recursiveCodesInNumberSystem;
import java.util.Scanner;
public class RecursiveFactorial {
	static int factorial(int n) {
		if(n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range of Factorial You Want");
		int range=sc.nextInt();
		System.out.println(factorial(range));
	}
}
