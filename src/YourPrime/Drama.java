package YourPrime;

public class Drama extends Genre {

	@Override
	double setPrice(int rating) {
		// TODO complete the method using the fees in the document
		if (rating > 3)
			this.price = 1.99;
		else if (rating == 3)
			this.price = 0.99;
		else
			this.price = 0;
		return this.price;
	}

}
