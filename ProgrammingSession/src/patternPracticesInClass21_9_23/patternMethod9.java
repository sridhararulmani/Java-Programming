package patternPracticesInClass21_9_23;
import java.util.Scanner;
public class patternMethod9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for a");
		int a=sc.nextInt();
		for(int i=a;i>=1;i--) {
			for(int j=1;j<=a-i;j++) {
				System.out.print("  ");
			}
			char c='a';
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(c+" ");
				if(j<i) {
					c++;
				}
				else {
					c--;
				}
			}
			System.out.println();
		}
	}
}