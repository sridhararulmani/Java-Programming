package programingAssesment30_10_23;
import java.util.Scanner;
public class xylamOrPholemNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value ");
		int a=sc.nextInt();
		String res=isXylemOrPoylem(a);
		System.out.println(res);
	}
	static String isXylemOrPoylem(int n) {
		int x=n,es=0,ms=0;
		do{
			int d=n%10;
			if(d==n||n==x) {
				es=es+d;
			}
			else {
				ms=ms+d;
			}	
			n=n/10;
		}while(n!=0) ;
		if(es==ms) {
			return "Xylem";			
		}
		else {
			return "Phloyem";
		}
	}
}