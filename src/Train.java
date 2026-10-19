import java.util.Scanner;
public class Train {
      private static Seat [][] seats=new Seat[23][4];
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int currentSeatNumber=1;
        for(int r=0 ; r<23;r++) {
        	for(int c =0;c<4;c++) {
        		seats[r][c]=new Seat(currentSeatNumber++);
        	}
        }
        if(reserveSeat(5,"samia")) {
        	System.out.println("successfully");
        }
        System.out.println(findSeat(5));
	}
	
	private static Seat findSeat(int seatNumber) {
		if(!Seat.isValid(seatNumber)) {
			return null;
		}
		int row =Seat.getRow(seatNumber)-1;
		int col =Seat.getColumn(seatNumber)-1;
		return seats[row][col];
	}
	public static boolean reserveSeat (int seatNumber , String passenger_name) {
		Seat seat = findSeat(seatNumber);
		if(seat!=null && seat.isEmpty()) {
			seat.setPassengerName(passenger_name);
			return true;
		}
		return false;
	}
	public static void deleteAllSeat() {
		for(int r=0;r<seats.length;r++) {
			for(int c =0; c<seats[r].length;c++) {
				if(seats[r][c]!=null) {
					seats[r][c].setPassengerName(null);
				}
			}
		}
		
	}

}
