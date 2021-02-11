
import java.util.Scanner;

	public class BusTransfer implements Price {

		boolean isLuxury;
		boolean noBus;
		String answer1;
		String answer2;
		
		public BusTransfer() {
			
			System.out.printf("Do you want bus transfer? Y/N\n");
			Scanner s = new Scanner(System.in);
			answer1= s.next();
			
			if(answer1.equalsIgnoreCase("Y")) {
				System.out.printf("Do you want luxury bus transfer? Y/N\n");
				answer2=s.next();
				
				if(answer2.equalsIgnoreCase("Y")) {
					isLuxury=true;
				}
				else if(answer2.equalsIgnoreCase("N")) {
					isLuxury=false;
				}
			}
			else if (answer1.equalsIgnoreCase("N")) {
				noBus = true;
			}
			
		}
	public void displayInformation() {
		if(isLuxury == true) {
			System.out.printf("You requested a luxury bus transfer.");
		}
		else {
			System.out.printf("You did not requested a luxury bus transfer.");
		}
	}
	public int calculatePrice() {
		if(isLuxury == true ) {
			return 200;
		}
		else {
			return 120;
		}
		
	}
}

