package patternPracticesInClass21_9_23;
import java.util.*;
public class patternMethod8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for a");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			int x=i;
			for(int j=1;j<=i;j++) {
				System.out.print(x+" ");
				x=x+a-j;
			}
			System.out.println();
		}
	}
}
