
public class Hangar {

	public static void main(String[] args) {
		
		Car peugeot = new Car("Peugeot", 134877);
		Boat myYacht = new Boat("King Vivi II", 1422);
		
		System.out.println(peugeot.doStuff());
		System.out.println(myYacht.doStuff());
	}

}
