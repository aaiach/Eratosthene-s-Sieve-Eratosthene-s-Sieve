package me.adriel.prime;

import java.util.ArrayList;

public class Main {
	
	/**
	 * Execution time for all primes up to 100000 is 32075ms
	 * This method finds prime numbers using the Eratosthene's Sieve technique.

	 * Adriel Aiach
	**/
	
	
	public static ArrayList<Integer> primes = new ArrayList<Integer>();

	public static void main(String[] args) {
		
		long time_b = System.currentTimeMillis();
		getPrimes(100000);
		long time_a = System.currentTimeMillis();

		System.out.println("Time taken to execute: " + (time_a - time_b));
	}

	public static void getPrimes(int max) {

		//Inserting all integers from our selected range of values into an ArrayList
		for (int d = 2; d <= max ; d++) {
			primes.add(d);
		}

		//Looping through all possible factors within our selected range and removing them from the ArrayList
		for (int i = 2; i < (max/3) ; i++) {
			for(int j = 2; (i*j) <= max; j++) {
				if(primes.contains(i*j)){
					primes.remove(primes.indexOf(i*j));
				}
			}
		}
		
		//Outputting all remaining elements from the ArrayList, which are the primes
		for (Integer i : primes) {
			System.out.println(i);
		}
	}
}
