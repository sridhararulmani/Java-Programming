package programingAssesment20_9_23;
import java.util.*;
public class paternMethod5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for A");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=i-1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=a;j++) {
				 System.out.print(j);
			}
			System.out.println();
		}
	}
}
