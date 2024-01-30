package YourPrime;

public class Autobiography extends Genre {

	@Override
	double setPrice(int rating) {
		// TODO complete the method using the fees in the document
		if (rating > 3)
			this.price = 2.99;
		else if (rating == 3)
			this.price = 1.99;
		else
			this.price = 0.99;
		return this.price;
	}
}
