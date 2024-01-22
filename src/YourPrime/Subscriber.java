package YourPrime;

import java.util.List;

public class Subscriber {
	
	// TODO complete the subscriber class, use the UML diagram in the task document
	
	public Subscriber(String userID, String name, MyMedia myMedia) {
		// TODO assign all arguments to the instance variables
	}
	
	public double getFees() {
		// TODO return fees for all subscribed items
	}
	
	public List<?> sort(String orderType) {
		// TODO return sorted list based on orderType argument
	}
	
	@Override
	public String toString() {
		// TODO return a string with the following message:
		// name-of-subscriber Acc no: user-id total charge is the fees for show-all-subscribed-media
	}
}
