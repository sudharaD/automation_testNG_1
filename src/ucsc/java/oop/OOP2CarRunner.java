package ucsc.java.oop;

public class OOP2CarRunner {

	public static void main(String[] args) {
		
		OOP1Car carObject1 = new OOP1Car();
		
		carObject1.make = "Toyota";
		carObject1.model = "Raiz";
		carObject1.fuelType = "Petrol";
		carObject1.color = "White";
		
		carObject1.moveForward();
		carObject1.moveBackward();
		
		OOP1Car carObject2 = new OOP1Car();
		
		carObject2.make = "Suzuki";
		carObject2.model = "Every";
		carObject2.fuelType = "Petrol";
		carObject2.color = "White";
		
		carObject2.moveForward();
		carObject2.moveBackward();
		
	}

}
