package patternPracticesInClass21_9_23;
import java.util.*;
public class patternModel3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for a");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<=a;j++) {
				System.out.print(j+" ");
			}
			for(int j=a-1;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
