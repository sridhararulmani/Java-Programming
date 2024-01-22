package programingAssesment4_10_23;
import java.util.Scanner;
public class NumberOfNegativeAndPositiveInArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("Enter the "+size+" Elements");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		int[] res=isNegOrPositive(array);
		System.out.println("Positive number Count is :"+res[0]);
		System.out.println("Negative number Count is :"+res[1]);
	}
	static int[] isNegOrPositive(int[] a) {
		int Ncount=0,Pcount=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>=0) {
				Pcount++;
			}
			else {
				Ncount++;
			}
		}
		int[] rs= {Pcount,Ncount};
		return rs;
	}
}
