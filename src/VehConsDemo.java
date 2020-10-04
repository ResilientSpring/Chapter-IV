
public class VehConsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// construct complete vehicles
		Vehicle minivanVehicle = new Vehicle(7, 16, 21);
		Vehicle sportscarVehicle = new Vehicle(2, 14, 12);

		int dist = 252;
		double gallons = minivanVehicle.fuelneeded(dist);
		System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");

		gallons = sportscarVehicle.fuelneeded(dist);

		System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel.");

	}

}
