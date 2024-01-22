package programingAssesment11_9_23_Asses;
import java.util.*;
public class numIsZeroOrNot {
	public static void main(String[] args) {
		String res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the valu");
		int a=sc.nextInt();
		if(a==0) {
			res="The given number is 0";
		}
		else {
			res="the given number is not 0";
		}
		System.out.println(res);
	}
}