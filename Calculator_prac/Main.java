package Calculator_prac;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        operations op = new operations();
        Scanner sc = new Scanner(System.in);
        double ans = 0;
        String continu;
        
        do{
        System.out.println("1.Add 2.Subtract 3.Multipy 4.Divide...\nEnter the operation symbol:");
        int ch = sc.nextInt();
        System.out.println("Enter the number of numbers");
        int n = sc.nextInt();
        if(n==0) {continu = "y"; }
        else {
    	System.out.println("Enter your Numbers");

        switch(ch){
            case 1:
                ans = op.add(n,sc);
                break;
            case 2:
                ans = op.sub(n,sc);
                break;
            case 3:
                ans = op.multiply(n,sc);
                break;
            case 4:
            	try {
				ans = op.divide(n,sc);
				//System.out.println("answer$$$"+Double.isans);
				if(Double.isInfinite(ans)) {
					throw new ArithmeticException("HELLOW WORLD");
				}
            	}catch(ArithmeticException e) {
            		System.out.println(e.getMessage());
            	}
				break;
				
            default:
            System.exit(0);
            }
        System.out.println("Result:"+ans);
	    System.out.println("Do you want to continue?/n(Press any key to continue and press 0 to exit)");
	    continu = sc.next();
        }
       }
        while(!continu.equals("0"));
        System.out.println("Program terminated! Result:"+ans);
    }
}