package programingAssesment13_9_23;
import java.util.Scanner;
public class passOrFail {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entrer the mark1");
		int mark1=sc.nextInt();
		System.out.println("entrer the mark2");
		int mark2=sc.nextInt();
		System.out.println("entrer the mark3");
		int mark3=sc.nextInt();
		System.out.println("entrer the mark4");
		int mark4=sc.nextInt();
		if(mark1>=90&&mark2>=90&&mark3>=90&&mark4>=90) {
			System.out.println("Distinsion");
		}
		else if(mark1>=80&&mark2>=80&&mark3>=80&&mark4>=80) {
			System.out.println("First class");
		}
		else if(mark1>=60&&mark2>=60&&mark3>=60&&mark4>=60) {
			System.out.println("Second class");
		}
		else if(mark1>=35&&mark2>=35&&mark3>=35&&mark4>=35) {
			System.out.println("Pass");
		}
		else {
			System.out.println("better Ass next time");
		}	
	}
}