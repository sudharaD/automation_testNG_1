package ucsc.java.oop;

public class OOP4ParentVehicle {
	
	private String make;
	private String model;
	private String fuelType;
	private String color;
	
	public void moveForward() {
		System.out.println("Car is (" + make + ", " + model + ", " + fuelType + ", " + color + ", " + " moveing forward");
	}
	
	public void moveBackward() {
		System.out.println("Car is (" + make + ", " + model + ", " + fuelType + ", " + color + ", " + " moveing backward");
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
}
