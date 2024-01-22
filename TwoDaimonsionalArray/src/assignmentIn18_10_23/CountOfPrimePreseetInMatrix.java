package assignmentIn18_10_23;

public class CountOfPrimePreseetInMatrix {
	static int countOfPrimeINMat(int[] m[]) {
		int  Pcount = 0;
		for (int i = 0; i < m.length; i++) {
			int count = 0;
			for (int j = 0; j < m[i].length; j++) {
				System.out.println(m[i][j]);
				for (int k = 2; k <=m[i][j]/2; k++) {
					if (m[i][j] % k == 0){
						count++;
					}
				}
				if (count == 0){
					Pcount++;
				}
			}
		}
		return Pcount;
	}
	public static void main(String[] args) {
		int[] mat[] = { { 2, 2, 9 }, { 2, 2, 2 }, { 2, 2, 2 } };
		int res = countOfPrimeINMat(mat);
		System.out.println(res);
	}
}