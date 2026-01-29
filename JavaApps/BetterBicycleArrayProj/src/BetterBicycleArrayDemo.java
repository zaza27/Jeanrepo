
public class BetterBicycleArrayDemo {

	public static void main(String[] args) {
		BetterBicycle bike1 = new AcmeBetterBicycle();
		BetterBicycle bike3 = new MountainBike(9,8,7,15);

		BetterBicycle[] bikeArray = {bike1, bike3};
		printBikes(bikeArray);
	}
	
	public static void printBikes(BetterBicycle[] bikes) {
		for (BetterBicycle b : bikes) {
			b.printStates();
		}
	}

}
