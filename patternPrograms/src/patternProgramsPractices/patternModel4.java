package patternProgramsPractices;
import java.util.Scanner;
public class patternModel4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for a");
		int a=sc.nextInt();
		for(int k=1;k<=a;k++) {
			for(int l=1;l<=k;l++){
				System.out.print(l);
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=1;i<=a;i++) {
			for(int j=a;j>=i;j--) {
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}