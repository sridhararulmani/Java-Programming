package assignmentIn18_10_23;
import java.util.Scanner;
public class Search {
	static boolean searchElement(int s,int m[][]){
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				if(m[i][j]==s)
					return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Search Value");
		int search=sc.nextInt();
		int mat[][]= {{10,20,30},{11,22,33},{77,83,36}};
		boolean res=searchElement(search,mat);
		if(res) {
			System.out.println("The given Vale is Present in the Matrix");
		}
		else {
			System.out.println("The given Vale is not Present in the Matrix");
		}
	}
}
