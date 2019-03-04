package math.problems;
import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) throws Exception {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		int i = 0;
		int num = 0;
		String primeNumber = "";
		for (i = 0; i <= 10; i++) {
			int count = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					count = count + 1;
				}
			}
			if (count == 2) {
				primeNumber = primeNumber + i + " ";
			}
		}
		System.out.println("Prime number 1 to 1000000 are :");
		System.out.println(primeNumber);

	}
}



