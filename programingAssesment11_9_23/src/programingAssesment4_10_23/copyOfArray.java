package programingAssesment4_10_23;
import java.util.Scanner;
public class copyOfArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("Enter the "+size+" Elements");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		int[] res=xeroz(array);
		
	}
	static int[] xeroz(int[] a) {
		int[] a2,sum;
		for(int i=0;i<a.length;i++) {
			a[i]=a2[i];
			sum[i]=sum[i]+a2[i];
		}
		return sum[];
	}
}
