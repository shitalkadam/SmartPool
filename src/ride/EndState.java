package ride;

import java.util.Scanner;

public class EndState implements StateInterface {

	RideInterface ride;
	
	public EndState(RideInterface r) {
		
		ride = r;
	}

	@Override
	public String startRide(int choice) {

		return "Ride has ended!";
	}

	@Override
	public String waitingRide(int choice) {
		return "Ride has ended!";
	}

	@Override
	public String delayRide(int choice) {
		return "Ride has ended!";
	}

	@Override
	public String endRide(int choice) {
			
		return "Dear customer, ride ended! Thank you! See you again!";	
	}

	@Override
	public String cancelRide(int choice) {
		return "Ride has ended!";
	}

	@Override
	public String initiateRide() {
		// TODO Auto-generated method stub
		return null;
	}

}
