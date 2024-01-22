package numberSystem;
import java.util.Scanner;
public class Methods {
	public static int[] myArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter the "+size+" Elements");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		return array;
	} 
	public static void displayArray(int[] array) {
		System.out.print("Array = {");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
			if(i<array.length-1) {
				System.out.print(",");
			}
		}
		System.out.print("}");
		System.out.println();
	}
	public static int[] evenAndOddElementCount(int[] array) {
		int oddCount=0,evenCount=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		int[] count= {evenCount,oddCount};
		return count;
	}
	public static void countPrintStatement(int[] count) {
		for(int i=0;i<count.length;i++) {
			if(i==0) {
				System.out.println("Even Count of the given Array :"+count[i]);
			}
			else{
				System.out.println("Odd Count of the given Array :"+count[i]);
			}	

		}
		System.out.println();
	}
	public static boolean primeIsPresentOrNot(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=2;j<=array.length-1;i++) {
				if(array[i]%j==0) {
					return false;
				}
				else {
					return true;
				}
			}
		}
		return false;
	}
	public static void resPrintStatement(boolean res) {
		if(res) {
			System.out.println("Prime Numbers are Present in this Array");
		}
		else {
			System.out.println("Prime Numbers are not Present in this Array");
		}
	}
	public static int countOfThePrimeNumber(int[] array) {
		int primeCount=0;

		for(int i=0;i<array.length;i++) {
			int notAPrimeCount=0;
			for(int j=2;j<array.length-1;j++) {
				if(array[i]%j==0) {
					notAPrimeCount++;
				}

			}
			if(notAPrimeCount==0) {
				primeCount++;
			}
		}
		return primeCount;
	}
	public static void printStatementOfResOfcountOfThePrimeNumber(int printStatementOfResOfcountOfThePrimeNumber) {
		System.out.println();
		System.out.println(printStatementOfResOfcountOfThePrimeNumber+" Prime Numbers are Present in the given Array");
		System.out.println();
	}
	public static int[] primeNumberIntTheArray(int[] array,int countOfTheNewArraySize) {
		int[] newArray=new int[countOfTheNewArraySize];
		int k=0;
		for(int i=0;i<array.length;i++) {
			int count=0;
			for(int j=2;j<+array[i]/2;j++) {
				if(array[i]%j==0) {
					count++;
				}
			}
			if(count==0) {
				array[i]=newArray[k];
				k++;
			}
		}

		return newArray;
	}
	public static void printStatementsOfPrimeNumbers(int[] array) {
		System.out.print("Prime Array = {");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
			if(i<array.length-1) {
				System.out.print(",");
			}
		}
		System.out.print("}");
	}
	public static int whatIsTheBiggesFromTheArray(int[] array) {

		int bigestInTheArray=0;
		for(int i=0;i<array.length;i++) {

			//			FINDING BIGGEST IN THE ARRAY
			if(array[i]>bigestInTheArray) {
				bigestInTheArray=array[i];
			}
		}
		return bigestInTheArray;
	}
	public static int primeCountFromTheBiggestInTheArray(int[] arrray,int bigestInTheArray) {
		int pCount=0;
		int count=0;
		for(int j=0;j<=bigestInTheArray;j++) {

			for(int k=2;k<bigestInTheArray;k++) {
				if(j%k==0) {
					count++;
				}
			}
			if(count==0) {
				pCount++;
			}
		}
		return pCount;
	}
	public static int[] toPrintAllThePrimeNumberWithinbiggestFromTheArray(int primeCountToCreateNewArray,int biggestOfTheArray) {
		int[] newArray2=new int[biggestOfTheArray+1];
		int pCount=0,count=0;
		for(int i=0;i<newArray2.length;i++) {
			for(int j=0;j<=newArray2.length;j++) {
				if(i%j==0) {
					count++;
				}
				if(count==0) {
					newArray2[i]=j;
				}
			}
		}
		return newArray2;
	}
	public static void toPrntAlllThePrimeNumbersFromTheBiggest(int[] newArray2) {
		System.out.print("All the Prime Number ={");
		for(int i=0;i<newArray2.length;i++) {
			System.out.print(newArray2[i]);
		}
		System.out.print("}");
		System.out.println();
	}
}