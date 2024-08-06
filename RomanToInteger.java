import java.util.HashMap;

class RomanToInteger {

	public int romanToInt(String s) {
		HashMap<Byte, Integer> romanInt = new HashMap<Byte, Integer>();

		// { 73, 86, 88, 76, 67, 68, 77 }
		byte [] arr = "IVXLCDM".getBytes();
		

		romanInt.put(arr[0], 1);
		romanInt.put(arr[1], 5);
		romanInt.put(arr[2], 10);
		romanInt.put(arr[3], 50);
		romanInt.put(arr[4], 100);
		romanInt.put(arr[5], 500);
		romanInt.put(arr[6], 1000);

		byte [] romanArr = s.getBytes();

		//System.out.print(romanInt.get(romanArr[0]));
		byte prev = romanArr[0];
		int value = 0;
		
		for (int i = 0; i < romanArr.length; i++) {
			byte curr = romanArr[i];

			if (romanInt.get(prev) < romanInt.get(curr)) {
				System.out.print("edge");	
				value += romanInt.get(curr) - 2 * romanInt.get(prev);
			} else {
				value += romanInt.get(curr);
			}

			prev = romanArr[i];
		}

		return value;
	}
}
