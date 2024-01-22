package arrayQuestionsPracticesInClass;
import java.util.Scanner;
public class MergeArray {
	public static void main(String[] args) {	
		//int[] res=mergeArrays(readArray());
		int[] a= {1,5,6,9};
		int[] b= {2,3,4,7,8};
		int[] c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[i]=b[i];
		}
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++) {
				if(c[i]<c[j]) {
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}
	}
	/*tatic int[] readArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("enter the "+size+" Elements");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		return array;
	}
	static int[] mergeArrays(int[] a) {
		for(int i=0;i<a.length;i++) {
			
		}
		return ;
	}*/
}