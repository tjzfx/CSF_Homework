
public class Reservation {
 
  private String name;
	private int numberOfPeople;
	private int reservationTime;
	
	public Reservation()
	{
	}
	
	public Reservation(String sName, int iNumberOfPeople, int iReservationTime)
	{
		this.name = sName;
		this.numberOfPeople = iNumberOfPeople;
		this.reservationTime = iReservationTime;
 
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}
 
	public void setReservationTime(int reservationTime) {
		this.reservationTime = reservationTime;
	}
 
	
}