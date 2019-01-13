package datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<Integer> ar = new ArrayList<>();

		ar.add(2100);
		ar.add(3200);
		ar.add(2456);
		ar.add(3125);
		ar.add(3867);
		ar.add(9734);
		ar.add(9056);
		ar.add(1200);

		//Print Array List
		System.out.println("Retrieving elements from ArrayList: " + ar);

		//Using get method to peek the first element
		System.out.println("Arrays peek element: " + ar.get(0));

		//remove element from ArrayList
		System.out.println("Remove element at index 3: " + ar.remove(3));

		//Retrieving elements from ArrayList
		System.out.println("Re-retrieving elements from ArrayList: " + ar);

		// retrieving data Using forEach loop
		System.out.print("Re-retrieving elements from ArrayList: ");
		for (Integer in : ar) {
			System.out.print(" "+in);
		}
		System.out.println();

		//retrieving data using iterator
		System.out.print("Re-retrieving elements from ArrayList: ");
		Iterator it = ar.iterator();
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			System.out.print(" "+i);
		}

		System.out.println();

		//Sorting ArrayList
		Collections.sort(ar);
		System.out.println(ar);
		List list = new ArrayList();
		list = ar;





	}

}
