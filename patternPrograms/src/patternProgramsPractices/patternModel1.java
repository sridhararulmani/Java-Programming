package patternProgramsPractices;
import java.util.Scanner;
public class patternModel1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the pattern");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
