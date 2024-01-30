package YourPrime;

public class Rap extends Genre {
	
	//TODO complete method override
	@Override
	double setPrice(int rating) {
		if (rating > 3)
			this.price = 4.99;
		else if (rating == 3)
			this.price = 3.99;
		this.price = 1.99;
		return this.price;
	}
}
