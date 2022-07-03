package ucsc.java.oop;

public class OOP4ChildCar extends OOP4ParentVehicle {

	private int noOfDoors;
	
	public void doorOpen() {
		System.out.println("Car stoped moving if one of the " + noOfDoors + " doors opens");
	}
	
	public void doorClosed() {
		System.out.println("Car start moving when all the " + noOfDoors + " doors were closed");
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	
	
}

