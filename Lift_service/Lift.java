package Lift_service;

public class Lift {
	private String uid;
    private int currentPos;  
    
    Lift(String uid){
        this.uid = uid;
        currentPos = 0;
    }
    
    String getUid(){
        return uid;
    }
    
    int getcurrentPos(){
        return currentPos;
    }
    
    void setcurrentPos(int currentPos){
        this.currentPos = currentPos;
    }
    
}
