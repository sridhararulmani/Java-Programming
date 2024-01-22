package programingAssesment4_10_23;
import java.util.Scanner;
public class ReverseAnArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("Enter the "+size+" Elements");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		revArray(array);
	}
	static void revArray(int[] a) {
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	} 
}
