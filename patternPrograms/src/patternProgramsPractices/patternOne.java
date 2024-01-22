package patternProgramsPractices;
import java.util.*;
public class patternOne {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the pattern");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				int num=(j%2==0)?0:1;
				System.out.print(num);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}