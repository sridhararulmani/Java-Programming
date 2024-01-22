package patternPracticesInClass21_9_23;
import java.util.Scanner;
public class patternMethod5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for A");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a-i;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
				if(j<i){
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}