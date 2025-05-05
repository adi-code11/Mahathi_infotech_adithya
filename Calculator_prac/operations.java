package Calculator_prac;
import java.util.Scanner;

public class operations {
	double add(int n,Scanner sc){
        double result = 0;
        for(int i=0;i<n;i++){
            result+=sc.nextDouble();
        }
        return result;
    }
    
     double sub(int n,Scanner sc){
        double arr[] = new double[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextDouble();
        }
        double result = arr[0]; 
        for(int i=1;i<n;i++){
            result -= arr[i];
        }
        return result;
    }
    
    double multiply(int n,Scanner sc){
        double result = 0;
        for(int i=0;i<n;i++){
            result*=sc.nextDouble();
        }
        return result;
    }
    
    double divide(int n,Scanner sc){
    	double arr[] = new double[n];
    	double result = 0;
    	
        for(int i=0;i<n;i++){
            arr[i] = sc.nextDouble();
        }
        result = arr[0]; 
        for(int i=1;i<n;i++){
            result /= arr[i];
        }
       
    	
        return result;
}
}

