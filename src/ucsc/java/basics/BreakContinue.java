package ucsc.java.basics;

public class BreakContinue {

	public static void main(String[] args) {
		// break
		int breakAt = 5;
		for(int i = 0; i < 10; i++) {
			if(i == breakAt) {
				break;
			}
			System.out.println("i value is: " + i);
		} 
		System.out.println("Loop ended");
			
		// continue
		int continueAt = 5;
		for(int i = 0; i < 10; i++) {
			if(i == continueAt) {
				continue;
			}
			System.out.println("i value is: " + i);
		} 
		System.out.println("Loop ended");
	}

}
