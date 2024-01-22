package patternPracticesInClass21_9_23;
import java.util.*;
public class patternMethod4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for A");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print("  ");
			}
			for(int j=a;j>=i;j--) {
				System.out.print(j+" ");
			}
			for(int j=i+1;j<=a;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}