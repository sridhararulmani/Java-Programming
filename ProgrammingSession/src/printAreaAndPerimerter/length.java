package printAreaAndPerimerter;
import java.util.Scanner;
public class length {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for L");
		double l=sc.nextDouble();
		System.out.println("Enter the value for B");
		double m=sc.nextDouble();
		double per=2*(l+m);
		double area=l*m;
		System.out.println("area is :"+area);
		System.out.println("perimeter :"+per);
	}
}