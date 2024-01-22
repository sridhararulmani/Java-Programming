package biggestDigit;
import java.util.*;
public class FindBiggestDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the valiue for A");
		int a=sc.nextInt();
		int res=biggestDigit(a);
		System.out.println(res+" is the biggest digit in this given series");
	}
	static int biggestDigit(int n) {
		int lastNumber;
		int larg=0;
		while(n>0) {
			lastNumber=n%10;
			if(larg<lastNumber) {
				larg=lastNumber;
			}
			n=n/10;//to take all the digits before last digit 
		}
		return larg;
	}
}