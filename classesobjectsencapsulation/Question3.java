package classesobjectsencapsulation;

import java.util.Date;

class Flight {


	private static String flightName="QATAR AIRWAYS";
	
	private String flightNumber;

	private String departureAirport;

	private String destinationAirport;

	private String departureTime;

	private String arrivalTime;

	private int capacity;

	private int bookedSeats;

	public Flight(String flightNumber,String departureAirport, String destinationAirport,
			String departureTime, String arrivalTime, int capacity, int bookedSeats) {
		super();
		this.flightNumber = flightNumber;
		this.departureAirport = departureAirport;
		this.destinationAirport = destinationAirport;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.capacity = capacity;
		this.bookedSeats = bookedSeats;
	}

    public static void setFlightName(String flightNam)
    {
    	flightName=flightNam;
    }
	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public static String getFlightName() {
		return flightName;
	}

	public String getDepartureAirport() {
		return departureAirport;
	}

	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}

	public String getDestinationAirport() {
		return destinationAirport;
	}

	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getBookedSeats() {
		return bookedSeats;
	}

	public void setBookedSeats(int bookedSeats) {
		this.bookedSeats = bookedSeats;
	}

	public void display()
	{
		System.out.println("FLIGHTNAME:"+flightName+"\nFLIGHTNUMBER:"+flightNumber+"\nDEPARTUREAIRPORT:"+departureAirport+"\nDESTINATIONAIRPORT:"+destinationAirport+"\nDEPARTURETIME:"+departureTime+"\nARRIVALTIME:"+arrivalTime+"\nCAPACITY:"+capacity+"\nBOOKEDSEATS:"+bookedSeats);
	}
}

public class Question3
{
	public static void main(String[] args)
	{
		Flight flight=new Flight("101","THIRUVANDRUM","ABUDHABI","13:00","18:10",150,90);
		flight.display();
		
	}
}