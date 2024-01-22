package assignmentIn18_10_23;

public class transpose {
	static int[][] trans(int[] m[]){
		int[] rs[]=new int[m[0].length][m.length];
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				rs[i][j]=m[j][i];
			}
		}
		return rs;
	}
	public static void main(String[] args) {
		int mat[][]= {{10,20,30},{11,22,33},{77,83,36}};
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("------------------");
		int[][] mat3=trans(mat);
		
		for(int i=0;i<mat3.length;i++) {
			for(int j=0;j<mat3[i].length;j++) {
				System.out.print(mat3[i][j]+" ");
			}
			System.out.println();
		}
	}
}