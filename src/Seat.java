
public class Seat {
    private int seatNumber;
    private String passenger_name;
    
    Seat(){
    	
    }
    Seat (int seatNumber){
    this.seatNumber = seatNumber;
    this.passenger_name=null;
    }
    public int getSeatNumber() {
    	return seatNumber;
    }
    public void setSeatNumber(int seatNumber) {
    	this.seatNumber=seatNumber;
    }
    public  String getPassengerName() {
    	return passenger_name;
    }
	public void setPassengerName(String passenger_name) {
		this.passenger_name=passenger_name;
	}
	public boolean isEmpty() {
		return this.passenger_name==null;
				
	}
    public String toString() {
    	if(isEmpty()) {
    		return "Seat"+seatNumber+"[Empty]";
    	}else {
    		return "Seat"+seatNumber+"[Passenger:"+passenger_name+"]";
    	}
    }
    public static boolean isValid(int seatNumber) {
    	return seatNumber>=1 && seatNumber<=92;
    }
    public static int getRow(int seatNumber) {
    	if (!isValid(seatNumber)) {
    		return -1;
    	}
    	return(seatNumber-1)/4+1;
    }
    public static int getColumn(int seatNumber) {
    	if(!isValid(seatNumber)) {
    		return -1;
    	}
    	int rem=seatNumber%4;
    	return(rem==0) ? 4 : rem;
    }
}
