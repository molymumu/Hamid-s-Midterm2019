package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

			Queue<String> queue=new LinkedList();
			queue.add("NY");
			queue.add("FL");
			queue.add("AZ");
			queue.add("DC");
			queue.add("TT");

			System.out.println(queue.peek());
			System.out.println(queue.remove("AZ"));
			System.out.println(queue.peek());
		}

	}



