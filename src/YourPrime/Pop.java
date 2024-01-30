package YourPrime;

public class Pop extends Genre {

	//TODO complete method override
	@Override
	double setPrice(int rating) {
		if (rating > 3)
			this.price = 2.99;
		else if (rating == 3)
			this.price = 1.99;
		this.price = 0.00;
		return this.price;
	}
}
