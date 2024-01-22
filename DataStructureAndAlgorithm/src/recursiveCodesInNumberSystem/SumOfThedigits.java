package recursiveCodesInNumberSystem;

public class SumOfThedigits {
	static int sumOfTheDigits(int n) {
		if(n==0) {
			return 0;
		}
		return n%10+sumOfTheDigits(n/10);
	}
	public static void main(String[] args) {
		int sum=sumOfTheDigits(537);
		System.out.println(sum);
	}
}
