package arrayQuestionsPracticesInClass;
import java.util.Scanner;
public class LederNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter the size of the Array");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("Enter the "+size+" Elements");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		int[] res=leaderOrNot(array);
		System.out.println();
	}
	static int[] leaderOrNot(int[] a) {
		int big=0;
		for(int i=1;i<a.length;i++) {
			if(a[i]>big) {
				a[i]=big;
			}
		}
		int[] leaderNumbers= {big};
		return leaderNumbers;
	}
}
