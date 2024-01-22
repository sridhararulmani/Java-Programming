package programingAssesment12_9_23;
import java.util.*;
public class positiveFormate {
	public static void main(String[] args) {
		int res;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int a=sc.nextInt();
		res=(a<0)?(a*-1):a;
		System.out.println(res);
	}
}