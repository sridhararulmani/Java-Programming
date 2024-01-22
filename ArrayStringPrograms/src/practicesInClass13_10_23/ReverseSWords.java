package practicesInClass13_10_23;

public class ReverseSWords {
	public static void main(String[] args) {
		String str="hii hiii";
		char[] c=str.toCharArray();
		String s="";
		for(int i=c.length-1;i>=0;i--) {
			int l=i;
			while(i>=0&&c[i]!=' ') {
				i--;
			}
			int f=i+1;
			while(f<=1) {
				s=s+c[f++];
			}
			if(i>=0) {
				s=s+c[i];
			}
		}
		System.out.println(s);
	}
}