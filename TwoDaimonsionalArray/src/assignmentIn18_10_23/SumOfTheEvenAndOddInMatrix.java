package assignmentIn18_10_23;

public class SumOfTheEvenAndOddInMatrix {
	static int[] sumOfEvenAndOddInMat(int[] m[]) {
		int sumOfEve=0,sumOfOdd=0;
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				if(m[i][j]%2==0) {
					sumOfEve=sumOfEve+m[i][j];
				}
				else {
					sumOfOdd=sumOfOdd+m[i][j];
				}
			}
		}
		int[] sum={sumOfEve,sumOfOdd};
		return sum;
	}
	public static void main(String[] args) {
		int[] mat[]= {{10,20,30},{11,22,33},{77,83,36}};
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("----------------------");
		int[] res=sumOfEvenAndOddInMat(mat);
		System.out.println("Sum of the even number in matrix :"+res[0]);
		System.out.println("Sum of the odd number i matrix :"+res[1]);
	}
}
