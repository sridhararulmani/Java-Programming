package numberSystemInStream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class NumberSystems {
	public static int countPrime(int[] ar) {
		int count=(int) Arrays.stream(ar)
				.filter(NumberSystems::isPrime)
				.count();
		return count;
	}
	public static boolean isPrime(int n) {
		/*
		 * 		for(int i=2;i<n/2+1;i++) {
			if(i%2==0) {
				return false;
			}
		}
		return true;*/
		return IntStream.range(2, n/2+1).noneMatch(i->i%2==0);
	}
	public static void main(String[] args) {
		int[] array= {10,2,34,52,77,80,19,42,67,100};
		int count=countPrime(array);
		System.out.println("Prime Number counts :"+count);
	}
}
