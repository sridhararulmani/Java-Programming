package patternProgramsPractices;
import java.util.*;
public class patternProgram2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the vale for A");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				int num=(i%2==0)?0:1;
				System.out.print(num);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}