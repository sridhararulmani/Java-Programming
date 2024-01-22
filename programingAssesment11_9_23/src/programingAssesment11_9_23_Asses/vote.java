package programingAssesment11_9_23_Asses;
import java.util.*;
public class vote {
	public static void main(String[] args) {
		int eleg=18;
		String res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age");
		int age=sc.nextInt();
		if(age>=eleg) {
			res="Your eligable to Vote";
		}
		else {
			res="Your not eligable to Vote";
		}
		System.out.println(res);
	}
}