import java.math.BigDecimal;
import java.math.RoundingMode;

class AverageSalary {
	public double average(int [] salary) {
		int max = salary[0];
		int min = salary[0];
		int total = 0;
		for (int pay : salary) {
			if (pay >= max) {
				max = pay;
			}

			if (pay <= min) {
				min = pay;
			}

			total += pay;
		}

		double num = (double) salary.length;

		return BigDecimal.valueOf((total - max - min) / (num - 2)).setScale(5, RoundingMode.HALF_UP).doubleValue();
	}
}
