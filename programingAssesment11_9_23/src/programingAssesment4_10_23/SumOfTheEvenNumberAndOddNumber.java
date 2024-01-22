package programingAssesment4_10_23;

import java.util.Scanner;

public class SumOfTheEvenNumberAndOddNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("Enter the "+size+" Elements");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		int[] res=sumOfEvenAndOdd(array);
		System.out.println("Sum of the Even Number :"+res[0]);
		System.out.println("Sum of the Odd Number :"+res[1]);
	}
	static int[] sumOfEvenAndOdd(int[] a) {
		int sumOfEve=0,sumOfOdd=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sumOfEve=sumOfEve+a[i];
			}
			else {
				sumOfOdd=sumOfOdd+a[i];
			}
		}
		int[] rs= {sumOfEve,sumOfOdd};
		return rs;
	}
}
