package printAreaAndPerimerter;
import java.util.Scanner;
public class area {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the area");
		double a=sc.nextDouble();
		double per=a*a;
		double area=4*a;
		System.out.println("Area is :"+area);
		System.out.println("perimeter is :"+per);
	}
}