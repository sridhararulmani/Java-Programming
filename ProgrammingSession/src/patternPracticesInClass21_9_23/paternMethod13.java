package patternPracticesInClass21_9_23;
import java.util.*;
public class paternMethod13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for a");
		int a=sc.nextInt(),space=0,star=a;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
			if(i<=star) {
				space++;
				star=star-2;
			}
			else {
				space--;
				star=star+2;
			}
			System.out.println();
		}
	}
}