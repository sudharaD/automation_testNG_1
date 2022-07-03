package ucsc.java.basics;

public class ControlStructures {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 6;
		
		if (a > b) {
			System.out.println("This is true");
		} else if (a == b) {
			System.out.println("a equals to b");
		} else {
			System.out.println("This is false");
		}
		
		// while loop
		while (a < b) {
			System.out.println("Current A value is : " + a);
			a++;
		}
		
		// for loop
		for (int i = 0; i < b; i++) {
			System.out.println("i value is :" + i);
		}
		
		//do-while loop
		int j = 0;
		do {
			System.out.println("j value is : " + j);
			j++;
		} while(j < 10);

	}

}
