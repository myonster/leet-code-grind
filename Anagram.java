import java.util.Arrays;

class Anagram {

	public boolean find(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}

		byte [] arr1 = s.getBytes(); // O(nlog(n))
		byte [] arr2 = t.getBytes(); // O(nlog(n))

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		return Arrays.equals(arr1, arr2); //O(n)
	}

	// O(nlog(n)) + O(n) => O(nlog(n)) worst case time complexity 
	// solution beats 97.23%
}
