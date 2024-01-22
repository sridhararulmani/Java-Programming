package programingAssesment11_9_23_Asses;
import java.util.*;
public class biggestNum {
	public static void main(String[] args) {
		int big;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value fro A");
		int a=sc.nextInt();
		System.out.println("Enter the value fro B");
		int b=sc.nextInt();
		System.out.println("Enter the value fro C");
		int c=sc.nextInt();
		big=a;
		if(b>big) {
			big=b;
		}
		if(c>big) {
			big=c;
		}
		System.out.println(big);
	}
}
