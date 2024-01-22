package arrayQuestionsPracticesInClass;
import java.util.Scanner;
public class IntArrayToStringArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the ");
		int[] a= {1,2,3,5,9};
		int[] temp=a;
		int d=0,r;
		for(int i=0;i<a.length;i++) {
			r=a[i];
			d=d*10+r;
		}
		int i=d+1;
		System.out.println("String is "+d);
		System.out.println("converted Integer is :"+i);
	}
}