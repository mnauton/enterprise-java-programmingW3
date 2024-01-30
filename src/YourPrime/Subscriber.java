package YourPrime;

import java.util.List;

public class Subscriber {
	
	// TODO complete the subscriber class, use the UML diagram in the task document
	// variables
	protected String userID;
	protected String name;
	protected MyMedia myMedia;

	public Subscriber(String userID, String name, MyMedia myMedia) {
		// TODO assign all arguments to the instance variables
		this.userID = userID;
		this.name = name;
		this.myMedia = myMedia;
	}
	
	public double getFees() {
		// TODO return fees for all subscribed items
		return myMedia.calculateFees();
	}
	
	public List<?> sort(String orderType) {
		// TODO return sorted list based on orderType argument
		return myMedia.sort(orderType);
	}

	@Override
	public String toString() {
		// TODO return a string with the following message:
		// name-of-subscriber Acc no: user-id total charge is the fees for show-all-subscribed-media
		return (this.name + " with Acc no: " + this.userID + " total charge is "
				+ String.format("%.2f", getFees()) + " for:\n" + myMedia);
	}
}
