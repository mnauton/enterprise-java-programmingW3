package YourPrime;

abstract class Genre {
	// the superclass for our NotSpotify project
	// method(s):
	//  setPrice(int rating) - abstract method for genre sub-types
	double price = 0.0;
	abstract double setPrice(int rating);
}
