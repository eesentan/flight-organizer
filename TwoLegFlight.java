
import java.util.Scanner;

	public class TwoLegFlight extends Flight {
			
				String secondDestination;
				String seatNumber;
				int secondDepartureTime;
				int secondArrivalTime;
				int secondTimeZoneDifference;
				int secondDuration;
				int TimeZoneDifference;
				int duration;
				
				Scanner s=new Scanner(System.in);
				public TwoLegFlight (String seatNumber) {
					super(seatNumber);
					
					System.out.printf("Second Destination:");
					secondDestination=s.nextLine();
					
					System.out.printf("Second Departure Time:");
					secondDepartureTime=s.nextInt();
					
					System.out.printf("Second Arrival Time:");
					secondArrivalTime=s.nextInt();
					
					System.out.printf("Second Time Zone Difference:");
					secondTimeZoneDifference=s.nextInt();
					
				}
				public int calculateDuration() {
					duration=(arrivalTime - departureTime)+TimeZoneDifference;
					secondDuration=(secondArrivalTime - secondDepartureTime)+secondTimeZoneDifference;
					return duration+secondDuration;
				}
				public int calculatePrice() {
					return calculateDuration() * 90;
					
				}
				
		}

