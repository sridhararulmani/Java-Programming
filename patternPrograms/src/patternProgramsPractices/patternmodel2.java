package patternProgramsPractices;
import java.util.Scanner;
public class patternmodel2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value for a");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=a;j>=i;j--) {
				if(i==1&&j==a||i==2&&j==4&j==5||i==3&&j==3||j==4||j==5&&i==4&&j>=2||j<=5||i==5&&j>=1||j<=5) {
				System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
