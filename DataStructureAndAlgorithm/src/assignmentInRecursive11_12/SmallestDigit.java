package assignmentInRecursive11_12;
import java.util.Scanner;

public class SmallestDigit {
	public static int findSmallDigit(int dig) {
		return findSmallDigit(dig,0);
	}
	public static int findSmallDigit(int dig, int sml) {
		int d=dig%10;
		if(d<sml){
			sml=d;
		}
		dig=dig/10;
		if(dig==0) {
			return sml;
		}
		return findSmallDigit(dig,sml);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Digits");
		int dig=sc.nextInt();
		int smallDigit=findSmallDigit(dig);
		System.out.println(smallDigit);
	}
}