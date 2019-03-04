package datastructure;

import databases.ConnectToSqlDB;

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

		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(20);
		arrList.add(30);
		arrList.add(40);
		arrList.add(50);
		arrList.add(60);

		System.out.println("Retrieving elements from ArrayList: " + arrList);
		System.out.println("Peek first element: " + arrList.get(0));
		System.out.println("Remove element at index 1: " + arrList.remove(1));
		System.out.println("Re-retrieving elements from ArrayList: " + arrList);
		System.out.println("Use of for-each loop: ");
		for (Integer in : arrList) {
			System.out.println(in);
		}
		System.out.println("Use of iterator using while loop: ");
		Iterator it = arrList.iterator();
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			System.out.println(i);
		}
		Collections.sort(arrList);
		System.out.println(arrList);
		List list = new ArrayList();
		list = arrList;

		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		connectToSqlDB.insertDataFromStringToSqlTable("array_list", "listElement");
		connectToSqlDB.insertDataFromArrayListToSqlTable(list, "array_list", "listElement");
		List<String> numbers = connectToSqlDB.readDataBase("array_list", "listElement");

		for (String st : numbers) {
			System.out.println(st);
		}
	}
}






