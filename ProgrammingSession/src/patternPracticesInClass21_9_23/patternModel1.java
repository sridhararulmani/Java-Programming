package patternPracticesInClass21_9_23;
import java.util.*;
public class patternModel1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for a");
		int a=sc.nextInt();	
		int x=5;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(x+" ");
				if(j<i) {
					x++;
				}
				else{
					x--;
				}
			}
			System.out.println();
		}
	}
}
