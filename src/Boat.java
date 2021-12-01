
public class Boat extends Vehicle {

	public Boat(String brand, int kilometers) {
		super(brand, kilometers);
	}
	
	public String doStuff() {
		return "I am " + getBrand() + " and I go glug glug!";
	}
}
