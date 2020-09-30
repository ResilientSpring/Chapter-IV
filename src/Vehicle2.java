
public class Vehicle2 {

	int passengers; // number of passengers.
	int fuelcap;    // fuel capacity in gallons.
	int mpg;        // fuel consumption in miles per gallon.
	
	// Display the range.
	void range() {    // The range() method is contained within the Vehicle class.
		System.out.println("Range is " + fuelcap * mpg);
	}

}
