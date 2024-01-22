package recursiveCodesInNumberSystem;

public class RecursiveOne {
	public static void main(String[] args) {
		display(3);
	}
	static void display(int n) {
		if(n==0) {
			return;
		}
		System.out.println("Hello");
		display(n-1);
	}
}