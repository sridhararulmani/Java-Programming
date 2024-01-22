package numberOfDevicibleOfTheGivenNumber;
import java.util.*;
public class numberOfDevicible {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for A");
		int a=sc.nextInt();
		int res=numOfDevicible(a);
		System.out.println(res+ " is the count of the given Devisible number");
	}
	static int numOfDevicible(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
				System.out.println(i+" the deviser");
			}
		}
		return count;
	}
}
