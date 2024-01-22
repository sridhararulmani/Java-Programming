package AssignmentPreacticesIn11_10_23;
import java.util.Scanner;
public class ConvertingEveryWordsLastCharToCAp {
	static String intCapL(String s) {
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(i==c.length-1&&c[i]!=' '||c[i]!=' '&&c[i+1]==' '){
				if(c[i]>='a'&&c[i]<='z') {
					c[i]=(char)(c[i]-32);
				}
			}
			else {
				if(c[i]>='A'&&c[i]<='Z') {
					c[i]=(char)(c[i]+32);
				}
			}
		}
		return new String(c);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		s=intCapL(s);
		System.out.println(s);
	}
}