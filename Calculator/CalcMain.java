package Calculator;

import java.util.Scanner;

public class CalcMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator calculator = new Calculator();
		int result = 0;
		String choice = " ";
		
		do {
		System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide\nEnter the operation:");
		int operation = sc.nextInt();
		if(operation>4) {System.err.println("Enter valid operation!!"); continue;}
		
		
		System.out.println("Enter the number of numbers: \nPress exit to go back to operations! ");
		String num = sc.next();
		
		if(num.equalsIgnoreCase("exit")) { 
			continue; 
		}
		
		else{ 
			int number = Integer.parseInt(num);
		
			int numArray[] = new int[number];
			System.out.println("Enter the numbers:");
			
			for(int i=0;i<number;i++) {
				try {
					System.out.printf("Enter the number %d:",(i+1));
					numArray[i] = sc.nextInt();
				}catch(Exception e) {
					System.err.println("Enter valid numbers!!!");
				}
			}
			
			switch(operation) {
			case 1:
				result = calculator.add(numArray);
				System.out.println("Result:" + result);
				break;
			case 2:
				result = calculator.subtract(numArray);
				System.out.println("Result:" + result);
				break;
			case 3:
				result = calculator.multiply(numArray);
				System.out.println("Result:" + result);
				break;
			case 4:
				result = (int) calculator.divide(numArray);
				System.out.println("Result:" + result);
				break;
			default:
				System.out.println("Enter valid option!!");
				}
			
			
			System.out.println("Do you want to continue? Press any key to continue\nNo to end");
			choice = sc.next();
		}
		}while(!choice.equalsIgnoreCase("no"));
		
		System.out.println("Result: "+result+"\nProgram has been terminated!!");
	}
}
