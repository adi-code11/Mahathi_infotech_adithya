package Lift_service;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        ServiceClass s1 = new ServiceClass();
        HashSet<String> hs = new HashSet<>();

        System.out.println("Enter the number of lifts:");
        int numOfLift = sc.nextInt();
        String ch = "y";
        Lift[] lifts = new Lift[numOfLift];
        
        for(int i=0;i<numOfLift;i++) { //Creating lift objects dynamically
        	System.out.println("Enter the lift "+(i+1)+" uid:");
        	String uid = sc.next();
	        	try {
	        	if(hs.add(uid)) { lifts[i] = new Lift(uid); }
	        	else { 
	        			throw new Exception("The UID already exist!!");
	        		}
	        	}catch(Exception e) { System.out.println(e.getMessage()); i--;}
        }
	
        
        for(int i=0;i<numOfLift;i++) {  //Adding lift objects into lists
        	s1.addlift(lifts[i]);
        }
        
		do {
			System.out.println("Available lifts:");
			for(int i=0;i<numOfLift;i++) {
				System.out.println(lifts[i].getUid());
			}
			System.out.println("Choose the lift to move:");
			String chosenLift = sc.next();
			
			
			if(!s1.checkup(chosenLift)){
				System.out.println("The chosen lift is not available!!\nChoose the right lift!!\n");
				continue;
			}
			
			
			System.out.println("Choose the floor to move to:");
			int floor = sc.nextInt();
			
			s1.move(chosenLift, floor);
			
			System.out.println("Do you want to continue? Press N to exit!!");
			 ch = sc.next();
			
		}while(!ch.equalsIgnoreCase("N"));
        //s1.move("001",10);
        System.out.println("Program terminated!!");
                
        //s1.move("002" , 10);
        //s1.move("001", 1,2);
        s1.posOfAllLifts();

        //System.out.println("Lift-"+l2.getUid()+" has moved to "+l2.getcurrentPos());
        
    }

}


