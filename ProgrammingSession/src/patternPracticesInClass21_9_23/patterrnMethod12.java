package patternPracticesInClass21_9_23;
import java.util.*;
public class patterrnMethod12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for a");
		int a=sc.nextInt();
		int sp=a/2,st=1;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=st;j++) {
				System.out.print("* ");
			}
			if(i<=a/2) {
				sp--;
				st=st+2;
			}
			else{
				sp++;
				st=st-2;
			}
			System.out.println();
		}
	}
}