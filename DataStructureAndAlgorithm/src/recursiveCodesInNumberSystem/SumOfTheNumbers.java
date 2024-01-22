package recursiveCodesInNumberSystem;
import java.util.Scanner;
public class SumOfTheNumbers {
	static int sumOfTheNumbersInTheRange(int n){
		if(n==0) {
			return 0;
		}
		System.out.println(n);
		return n+sumOfTheNumbersInTheRange(n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range");
		int range=sc.nextInt();
		int sum=sumOfTheNumbersInTheRange(range);
		System.out.println(sum);
	}
}
