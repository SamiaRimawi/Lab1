[Driver.java](https://github.com/user-attachments/files/33882847/Driver.java)

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Train t = new Train();
		
		System.out.println("Reservr seat 5 : "+ Train.reserveSeat(5, "Samia"));
		System.out.println("Reservr seat 5 again : "+ Train.reserveSeat(5, "Alaa"));
		System.out.println("Delete seat 5 : "+t.deletReserveSeat(5));
		
		Train.reserveSeat(2,"Layan");
		Train.reserveSeat(6, "Raneem");
		
		System.out.println("Train info");
		t.printInfo();

	}

}
