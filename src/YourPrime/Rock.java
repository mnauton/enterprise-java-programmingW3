package YourPrime;

public class Rock extends Genre {
	
	//TODO complete method override
	@Override
	double setPrice(int rating) {
		if (rating > 3) {
			this.price = 3.99;
		} else if (rating == 3) {
			this.price = 2.99;
		}
		this.price = 0.99;
		return this.price;
	}
}
