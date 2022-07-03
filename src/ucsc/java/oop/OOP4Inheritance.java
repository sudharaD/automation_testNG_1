package ucsc.java.oop;

public class OOP4Inheritance {

	public static void main(String[] args) {
		
		OOP4ChildCar object1 = new OOP4ChildCar();
		
		object1.setMake("Suzuki");
		object1.setMake("Every");
		object1.setFuelType("Petrol");
		object1.setColor("White");
		
		object1.moveForward();
		object1.moveBackward();
		
		object1.setNoOfDoors(4);
		
		object1.doorOpen();
		object1.doorClosed();

	}

}
