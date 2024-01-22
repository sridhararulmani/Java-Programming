package programingAssesment4_10_23;
import java.util.Scanner;
public class NumberOfPalindromePresentInArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("Enter the "+size+" Elements");
		for(int i=0;i<array.length;i++) { 
			array[i]=sc.nextInt();
		}
		int res=palindromeCount(array);
		System.out.println("Number of palindrome present in array is "+res);
	}
	static int palindromeCount(int[] a) {
		int count=0,rev=0;
		for(int i=0;i<a.length;i++) {
			if(isPalindromeOrNot(a[i])) {
				count++;
			}
		}
		return count;
	}
	static boolean isPalindromeOrNot(int a) {
		int sum=0,temp=a;
		do {
			int r=a%10;
			sum=sum*10+r;
			a=a/10;
		}while(a!=0);
		return sum==temp;
	}
}
