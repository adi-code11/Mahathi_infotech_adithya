package Calculator;

public class Calculator {

	int add(int[] numArray) {
		int sum = 0;
		for(int i : numArray) {
			sum+=i;
		}
		return sum;
	}
	
	int subtract(int[] numArray) {
		int difference = 0;
		for(int i : numArray) {
			difference-=i;
		}
		return difference;
	}
	
	int multiply(int []numArray) {
		int product = numArray[0];
		for(int i=1;i<numArray.length;i++) {
			product*=numArray[i];
		}
		return product;
		
	}
	
	double divide(int []numArray) {
		int quotient = numArray[0];
		for(int i=1;i<numArray.length;i++) {
			quotient/=numArray[i];
		}
		return quotient;
		
	}
}
