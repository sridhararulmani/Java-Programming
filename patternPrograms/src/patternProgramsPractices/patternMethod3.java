package patternProgramsPractices;
import java.util.*;
public class patternMethod3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for A");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}