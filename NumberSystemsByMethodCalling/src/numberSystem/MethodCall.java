package numberSystem;

public class MethodCall extends Methods{

	public static void main(String[] args) {

		//		METHODS CALLING

		int[] array=myArray();

		System.out.println("---------------");
		displayArray(array);
		System.out.println("---------------");
		System.out.println();

		int[] count=evenAndOddElementCount(array);
		countPrintStatement(count);

		boolean resOfPrimeIsPresentOrNot=primeIsPresentOrNot(array);
		resPrintStatement(resOfPrimeIsPresentOrNot);

		if(resOfPrimeIsPresentOrNot) {
			int resOfcountOfThePrimeNumber=countOfThePrimeNumber(array);
			printStatementOfResOfcountOfThePrimeNumber(resOfcountOfThePrimeNumber);
			int[] primeNubers=primeNumberIntTheArray(array,resOfcountOfThePrimeNumber);
			printStatementsOfPrimeNumbers(primeNubers);
		}
		else {
			int biggestOfTheArray=whatIsTheBiggesFromTheArray(array);
			int primeCountToCreateNewArray=primeCountFromTheBiggestInTheArray(array,biggestOfTheArray);

			int[] newArray2=toPrintAllThePrimeNumberWithinbiggestFromTheArray(primeCountToCreateNewArray,biggestOfTheArray);
			toPrntAlllThePrimeNumbersFromTheBiggest(newArray2);
		}

	}
}