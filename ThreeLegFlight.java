
import java.util.Scanner;

	public class ThreeLegFlight extends TwoLegFlight {
		
		String thirdDestination;
		String seatNumber;
		int thirdDepartureTime;
		int thirdArrivalTime;
		int thirdTimeZoneDifference;
		int thirdDuration;
		
		
		public ThreeLegFlight(String seatNumber) {

			super(seatNumber);
			
			Scanner s= new Scanner(System.in);
			
			System.out.printf("Third Destination:");
			thirdDestination=s.nextLine();
			
			System.out.printf("Third Departure Time:");
			thirdDepartureTime=s.nextInt();
			
			System.out.printf("Third Arrival Time:");
			thirdArrivalTime=s.nextInt();
			
			System.out.printf("Third Time Zone Difference:");
			thirdTimeZoneDifference=s.nextInt();
			
		}
		public int calculateDuration() {
			duration=(arrivalTime - departureTime)+TimeZoneDifference;
			secondDuration=(secondArrivalTime - secondDepartureTime)+secondTimeZoneDifference;
			thirdDuration=(thirdArrivalTime - thirdDepartureTime) +  thirdTimeZoneDifference;
			
			return duration+secondDuration+thirdDuration;
		}
		public int calculatePrice() {
			return calculateDuration() * 85;
			
		}
	}

