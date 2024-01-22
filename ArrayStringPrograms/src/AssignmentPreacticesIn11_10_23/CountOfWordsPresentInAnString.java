package AssignmentPreacticesIn11_10_23;
import java.util.Scanner;
public class CountOfWordsPresentInAnString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++) {
			if(i==0&&c[i]!=' '||c[i]==' '&&c[i+1]!=' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
