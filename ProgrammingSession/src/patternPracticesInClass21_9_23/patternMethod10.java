package patternPracticesInClass21_9_23;
import java.util.Scanner;
public class patternMethod10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for a");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a-i;j++) {
				System.out.print("  ");
			}
			int x=a;
			for(int j=x;j>=1;j--) {		
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}