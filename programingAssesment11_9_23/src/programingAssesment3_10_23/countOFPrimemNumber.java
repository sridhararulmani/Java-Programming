package programingAssesment3_10_23;
import java.util.Scanner;
public class countOFPrimemNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("Enter the "+size+" Elements");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		int res=count(array);
		System.out.println("Count of Prime Element in Array is "+res);
	}
	static int count(int[] a) {
		int count,pcount=0;
		for(int i=0;i<a.length;i++) {
			count = 0;
			for(int j=2;j<a[i]/2;j++) {
				if(a[i]%j==0) {
					count++;
				}
			}
			if(count==0) {
				pcount++;
			}
		}
		return pcount;
	}
}