package programingAssesment11_9_23_Asses;
import java.util.*;
public class avg {
	public static void main(String[] args) {
		int res;
		int count=3;
		//int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value fro A");
		int a=sc.nextInt();
		//count++;
		System.out.println("enter the value fro B");
		int b=sc.nextInt();
		//count++;
		System.out.println("enter the value fro C");
		int c=sc.nextInt();
		//count++;
		res=a+b+c;
		res=res/count;
		System.out.println(res);
	}
}