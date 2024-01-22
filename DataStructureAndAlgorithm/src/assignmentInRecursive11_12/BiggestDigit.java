package assignmentInRecursive11_12;
import java.util.Scanner;
public class BiggestDigit {
	public static int findBiggest(int dig) {
		return findBiggest(dig,-9);
	}
	public static int findBiggest(int dig, int big) {
		int d=dig%10;
		if(d>big) {
			big=d;
		}
		dig=dig/10;
		if(dig==0) {
			return big;
		}
		return findBiggest(dig,big);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Digits");
		int dig=sc.nextInt();
		int big=findBiggest(dig);
		System.out.println(big);
	}
}