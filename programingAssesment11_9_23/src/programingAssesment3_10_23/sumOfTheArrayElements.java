package programingAssesment3_10_23;
import java.lang.reflect.Array;
import java.util.Scanner;
public class sumOfTheArrayElements {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("Enter the "+size+" elements");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		int res=sumOfTheArray(array);
		System.out.println("Sum of the Array is "+res);
	}
	static int sumOfTheArray(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		return sum;
	}
}

