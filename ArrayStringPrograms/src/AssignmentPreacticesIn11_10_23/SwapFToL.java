package AssignmentPreacticesIn11_10_23;

import java.util.Scanner;

public class SwapFToL {
	static String swap(String s) {
		char[] c=s.toCharArray();
		int f=0;
		for(int i=0;i<c.length;i++) {
			if(i==0&&c[i]!=' '||c[i]!=' '&&c[i-1]==' ') {
				f=i;	
			}
			else if(i==c.length-1&&c[i]!=0||c[i]!=' '&&c[i+1]==' '){
				char t=c[f];
				c[f]=c[i];
				c[i]=t;
			}
		}
		return new String(c);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		s=swap(s);
		System.out.println(s);
	}
}