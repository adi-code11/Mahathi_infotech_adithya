package Lift_service;
import java.util.*;
public class ServiceClass implements Service{
	
	private int maxFloor = 10;
	List<Lift> lifts = new ArrayList<>();
	  
		void addlift(Lift l) {
			lifts.add(l);
		}
		
		boolean checkup(String uid) {
			for(Lift lift : lifts) {
				if(lift.getUid().equalsIgnoreCase(uid)) {
					return true;
				}
			}
			return false;
		}
		
	    public void move(String uid,int destiny){
	    	int flag = 0;
	    	try {
	    	if(destiny>maxFloor) {
	    		throw new Exception("Maximum number of floor is 10!!!");
	    	}
	    	for(Lift l : lifts){
	    		if(l.getUid().equals(uid)) {
	    			flag=1;
	    			if(destiny==l.getcurrentPos()) {
	    				System.out.println("Lift is already in "+l.getcurrentPos()+"!! Enter other floor!!");
	    			}
	    			else {
	    			int prevpos = l.getcurrentPos();
	    			l.setcurrentPos(destiny);
	    			System.out.println("Lift-"+l.getUid()+" has moved from "+prevpos+" to "+l.getcurrentPos());
	    				}
	    			}
	    		}
	    	if(flag==0) {System.out.println("Lift not found!");}
	    	}catch(Exception e) {
	    	System.out.println(e.getMessage());
	    }
	  }
	   
		public void move(String uid,int destiny_1,int destiny_2) {
			
			for(Lift l : lifts){
	    		if(l.getUid().equals(uid)) {
	    			if(destiny_1==l.getcurrentPos()||destiny_2==l.getcurrentPos()) {
	    				System.out.println("Lift is already in "+l.getcurrentPos()+"!! Enter other floor!!");
	    			}
	    			else {
	    				int prevpos = l.getcurrentPos();
		    			l.setcurrentPos(destiny_1);
		    			System.out.println("Lift-"+l.getUid()+" has moved from "+prevpos+" to"+l.getcurrentPos());

		    			System.out.println("Move to next floor? Y for yes and N for no!!");
		    			Scanner sc = new Scanner(System.in);
		    			String ch = sc.next();
		    			if(ch.equalsIgnoreCase("Y")) {
		    				System.out.println("Moving lift "+l.getUid()+" to "+destiny_2);
		    				int prev = l.getcurrentPos();
			    			l.setcurrentPos(destiny_2);
			    			System.out.println("Lift-"+l.getUid()+" has moved from "+prev+" to"+l.getcurrentPos());
		    				}
		    			else {
		    				System.out.println("Cancelling...");
		    				System.out.println("Lift-"+l.getUid()+" is at "+l.getcurrentPos());
		    				break;
		    				}
	    				}
	    			}
	    		}
	    	}
	    
	    public void posOfAllLifts(){
	    	System.out.println("The postion of all lifts:");
	        for(Lift l : lifts){
    			System.out.println("Lift-"+l.getUid()+" is at "+l.getcurrentPos());
	        }
	    }
	    
	    
}
