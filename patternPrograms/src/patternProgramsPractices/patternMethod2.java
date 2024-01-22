package patternProgramsPractices;
import java.util.*;
public class patternMethod2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for A");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
