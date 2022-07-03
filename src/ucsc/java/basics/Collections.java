package ucsc.java.basics;

//import java.util.ArrayList;

import java.util.*;

public class Collections {

	public static void main(String[] args) {
		int []marks = {50, 60, 70, 80, 90};
		
		System.out.println(marks.length);
		
		marks[1] = 95;
		
		/*System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		*/
		
		for(int i = 0; i < 5; i++) {
			System.out.println(marks[i]);
		}
		
		ArrayList<Integer> marks1 = new ArrayList<Integer>();
		
		marks1.add(10);
		
		marks1.get(0);
		
		marks1.set(0, 20);
		
		System.out.println(marks1);
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("City", "Colombo");
		map.put("Name", "Jhon Doe");
		map.put("Age", "20");
		
		System.out.println(map.get("City"));
	}

}
