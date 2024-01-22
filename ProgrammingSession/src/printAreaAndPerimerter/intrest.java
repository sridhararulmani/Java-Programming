package printAreaAndPerimerter;
import java.util.Scanner;
public class intrest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value a");
	double a=sc.nextDouble();
	System.out.println("Enter the value b");
	double b=sc.nextDouble();
	System.out.println("Enter the value c");
	double c=sc.nextDouble();
	double val=(a*b*c)/100;
	System.out.println(val);
}
}
