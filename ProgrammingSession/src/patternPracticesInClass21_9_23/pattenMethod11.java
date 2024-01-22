package patternPracticesInClass21_9_23;
import java.util.*;
public class pattenMethod11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for a");
		int a=sc.nextInt();
		for(int i=0;i<=a;i++) {
			for(int j=0;j<=i-1;j++) {
				System.out.print("  ");
			}
			for(int j=a-i;j>=1;j--) {
				System.out.print(j+" ");
			}
			for(int j=2;j<=a-i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
