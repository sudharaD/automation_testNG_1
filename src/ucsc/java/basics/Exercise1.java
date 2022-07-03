package ucsc.java.basics;

public class Exercise1 {

	public static void main(String[] args) {
		int subject1Mark = 10;
		int subject2Mark = 10;
		int subject3Mark = 10;
		int subject4Mark = 70;
		int subject5Mark = 14;
		
		int average = (subject1Mark + subject2Mark + subject3Mark + subject4Mark + subject5Mark) / 5;
		
		if(average > 70) {
			System.out.println("A-PASS");
		} else if(average > 50) {
			System.out.println("B-PASS");
		} else {
			System.out.println("REPEAT");
		}
	}

}
