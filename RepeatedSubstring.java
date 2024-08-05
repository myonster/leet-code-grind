import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

class RepeatedSubstring {

	public int [] sieve(int N) {

		boolean prime [] = new boolean[N+1];

		for (int i = 0; i <= N; i++) {
			prime[i] = true;
		}

		for (int p = 2; p * p <= N; p++) {
			if (prime[p] == true) {
			
				for (int i = p * p; i <= N; i+= p) {
					prime[i] = false;
				}
			}
		}

		
		int counter = 0;
		for (int i = 2; i < prime.length; i ++) {
			if (prime[i]) {
				counter++;
				
			}
		}

		int [] arr = new int [counter];
		int index = 0;
		for (int i = 2; i < prime.length; i ++) {
			
			if (prime[i]) {
				arr[index] = i;
				index++;
			}

		}

		return arr;
	}
	

	public boolean find(String s) {
		// 100 / 2 >2
		// 100 / 4 >4

		// scenario where s is even => check for the two splitted nodes
		// if its equal => all good !

		// need to be prime ?
		// 90/2 = 45/2 => 45/3 => 15/3 => 5


		// 3 5 7 11
		// for everyprime i call substring twice to just compare them
		// imagine the word has 121characters
		// 11 is the prime factor so =>
		
		// s.substring(0,11) compare with s.substring(11, 11+11)
		// s.substring(0, pN) compare with s.substring(pN, 2pN)

		// (s.substring(0, wordCount / 2).equals(s.substring(wordCount /2, wordCount)))

		// PRIME		
		
		int wordCount = s.length();
		int num = s.length();
		
		// generate array of prime numbers
		int [] arr = new RepeatedSubstring().sieve(wordCount);
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == wordCount) {
			//System.out.print("This word has prime length : " + arr[i]);
				for(int j = 0; j < wordCount - 1; j++){
					if (!s.substring(j, j+1).equals(s.substring(j+1, j+2))) {
						return false;
					}
				}
				return true;
			}
		}

		Queue<Integer> primeQueue = new LinkedList<>();
		int prevNum = 0;
		while (num > 1) {
			for (int i = 0; i < arr.length; i++) {
				if (num % arr[i] == 0) {
					if (prevNum != arr[i]) {
						primeQueue.add(arr[i]);
						prevNum = arr[i];
						System.out.println(arr[i]);	
					}
					num = num / arr[i];
				}
			}
		}

		while (!primeQueue.isEmpty()) {
			int currentPrime = primeQueue.poll();
			int iter = wordCount / currentPrime;
			// (0,3) (3,6)   (3,6) (6,9)    (9,12) (12,15)
			boolean status = true;
			for(int i = 0; i < iter - 1; i ++) {
				if (!s.substring(i, i + currentPrime).equals(s.substring(i + currentPrime, i + 2 * currentPrime))) {
					status = false;
				}
			}

			if (status) {
				return true;
			}
		}
			
		return false;
	}

	public boolean alt(String s) {
		int wordCount = s.length();

		if (wordCount <= 1) {
			return false;
		}

		
		for(int i = 0; i < wordCount; i++) {			
			int divisor = i + 1;

			if (divisor == wordCount) {
			 	break;
			}
			
			// System.out.println("Current divisor : " + divisor);
			if (wordCount % divisor == 0) {
				// System.out.println("word count can be divided");
				boolean status = true;
				// "abababab" => (0,2) vs (2,4) ... (2,4) vs (4,6) ... (4,6) vs (6,8)
				for(int j = 0; j <= wordCount - 2 * divisor; j += divisor) {
					if (!s.substring(j, j + divisor).equals(s.substring(j + divisor, j + 2 * divisor))) {
						// System.out.println("Partition mismatch");
						status = false;
						break;
					}
				}

				if (status) {
					// System.out.println("status: true, returning!");
					return true;
				} else {
					// System.out.println("status: false, continuing");
				}
			}
		}

		return false;
	}
}
