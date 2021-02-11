
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
		public class Main {
				public static void main(String[] args) {
							
				Scanner s=new Scanner(System.in);	
				int selected=0;
				int subselected=0;
				int subselected2=0;
				int size=0;
				int sum=0;
				String seatNumber;		
							
				ArrayList<Flight> FlightArrayList=new ArrayList<Flight>();
				ArrayList<BusTransfer> TransferArrayList=new ArrayList<BusTransfer>();
							
				while(true) {
												
					System.out.println("1.Create new Flight with Seat Number\n2.Display all Flights according to Seat Number\n3.Calculate Prices\n0.Exit\n");
					selected=s.nextInt();
								
					if(selected==1) {
						System.out.printf("1.Create a Non-Stop Flight\n2.Create a Two-Leg Flight\n3.Create a Three-Leg Flight\n");
						subselected=s.nextInt();
													
						if(subselected==1) {
									
							System.out.printf("Seat Number:");
							seatNumber=s.next();
												
							Flight Flight = new Flight(seatNumber);
							FlightArrayList.add(Flight);

							BusTransfer Bus = new BusTransfer();
							TransferArrayList.add(Bus);
							
							System.out.printf("Flight with seat number " +seatNumber+ " was created!");
						}
						else if(subselected==2) {
													
							System.out.printf("Seat Number:");
							seatNumber=s.next();
														
							TwoLegFlight TwoLegFlight =new TwoLegFlight(seatNumber);
							FlightArrayList.add(TwoLegFlight);
							
							BusTransfer Bus2 = new BusTransfer();
							TransferArrayList.add(Bus2);
			
							System.out.printf("Flight with seat number " +seatNumber+ " was created!\n");
						}
						else if(subselected==3) {
							System.out.printf("Seat Number:");
							seatNumber=s.next(); 
										
							ThreeLegFlight  ThreeLegFlight =new ThreeLegFlight(seatNumber);
							FlightArrayList.add(ThreeLegFlight);
							
							BusTransfer Bus3 = new BusTransfer();
							TransferArrayList.add(Bus3);
										
							System.out.printf("Flight with seat number " +seatNumber+ " was created!\n");
						}
					}
					if(selected==2) {
						Collections.sort(FlightArrayList);
						System.out.println("1.Ascending Order\n2. Descending Order");
						subselected2 = s.nextInt();
						
						if(subselected2 == 1) {
							for (int i=0 ; i <= FlightArrayList.size()-1 ; i++) {
								FlightArrayList.get(i).displayInfo();
								TransferArrayList.get(i).displayInformation();
							
							}
						}
						else if(subselected2 == 2) {
							for(int i=FlightArrayList.size()-1; i >= 0 ; i--) {
								FlightArrayList.get(i).displayInfo();
								TransferArrayList.get(i).displayInformation();
							}
						}
					}
					if(selected==3) {
						System.out.printf("Total price is:");
						
						for(int k=0;k<TransferArrayList.size();k++) {
							sum = sum + TransferArrayList.get(k).calculatePrice();
						}
						for(int i=0;i<FlightArrayList.size();i++) {
							sum = sum + FlightArrayList.get(i).calculatePrice();
						}
						
						for(int i= 0; i < FlightArrayList.size(); i++) {
							sum = sum + FlightArrayList.get(i).calculatePrice();
						}
						
						for(int i= 0; i < FlightArrayList.size(); i++) {
							sum= sum + FlightArrayList.get(i).calculatePrice();
						}
						
						System.out.printf("%d\n", sum);
					}	
					if(selected==0) {
						break;
					}
				}
			}
		}
