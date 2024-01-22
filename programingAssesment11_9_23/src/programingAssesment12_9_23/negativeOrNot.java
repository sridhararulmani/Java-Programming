package programingAssesment12_9_23;
import java.util.Scanner;
public class negativeOrNot {
	public static void main(String[] args) {
		String res;
		int con=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for A");
		int a=sc.nextInt();
		res=(a>=con)?"positive":"negative";
		System.out.println("the given number is "+res);
	}
}