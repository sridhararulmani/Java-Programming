package patternPracticesInClass21_9_23;
import java.util.Scanner;
public class patternMethod7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for A");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a-i;j++) {
				System.out.print("  ");
			}
			char c='A';
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