package ucsc.java.oop;

public class OOP3Encapsulation {

	public static void main(String[] args) {
		
		OOP3Car carObject = new OOP3Car();
		
		carObject.setMake("Mahindra");
		carObject.setModel("KUV100");
		carObject.setFuelType("Petrol");
		carObject.setColor("White");
		
		carObject.moveForward();
		carObject.moveBackward();

	}

}
