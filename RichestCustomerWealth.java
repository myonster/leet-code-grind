import java.util.Arrays;

class RichestCustomerWealth {
	public int maximumWealth(int [][] accounts) {
		int sum = 0;
		for (int [] wealth : accounts) {
			int total = Arrays.stream(wealth).sum();

			sum = total > sum ? total : sum;
		}


		return sum;
	}
}
