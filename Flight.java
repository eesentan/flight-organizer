
import java.util.Scanner;
import java.lang.Comparable;
import java.lang.String;
	public class Flight implements Price,Comparable<Flight> {
					String destination;
					String origin;
					String passengerName;
					int departureTime;
					int arrivalTime;
					int duration;
					int timeZoneDifference;
					String seatNumber;
					
					 public Flight(String seatNumber){
						 
						 this.seatNumber = seatNumber;
						 
						  Scanner myScanner=new Scanner(System.in);
						  
						  System.out.printf("%s\n","Passenger Name:");
						  passengerName=myScanner.nextLine();
						  
						  System.out.printf("%s\n","Origin:");
						  origin=myScanner.nextLine();
						  
						  System.out.printf("%s\n","Destination:");
						  destination=myScanner.nextLine();
						  
						  System.out.printf("%s\n","Departure Time:");
						  departureTime=myScanner.nextInt();
						  
						  System.out.printf("%s\n","Arrival Time:");
						  arrivalTime=myScanner.nextInt();
						  
						  System.out.printf("%s\n","Time Zone Difference:");
						  timeZoneDifference=myScanner.nextInt();
					 }
					 public int calculateDuration(){
						 
						 duration=(arrivalTime-departureTime)+timeZoneDifference;
						 return duration;
					 }
					 public void displayInfo(){
						calculateDuration();
						 
					    System.out.println(passengerName +"'s flight from "+origin+ " to " + destination +" departs at " +departureTime+" and lands at " +arrivalTime +" with duration " + duration+" hours and selected seat number is "+seatNumber);
					    
					 }
					 public int calculatePrice() {
						 return calculateDuration() * 100 ;
						 
					 }
					 public int compareTo(Flight F) {
						 return seatNumber.compareTo(F.seatNumber);
						
						 
					
					 }
					 
				}


