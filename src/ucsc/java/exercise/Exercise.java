package ucsc.java.exercise;

public class Exercise {

	public static void main(String[] args) {

		Circle circle = new Circle();
		
		circle.setArea(20);
		circle.setColor("Orange");
		
		System.out.println("Area is " + circle.getArea() + " cm2.");
		System.out.println("Color is " + circle.getColor() + ".");

	}

}
