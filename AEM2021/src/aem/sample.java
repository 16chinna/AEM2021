package aem;

public class sample {

	public static String getwords(long n) {

		String word = "";
		String[] unit = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
				"Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
		String[] tens = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
		String[] cvalue = { "Crores", "Lakhs", "Thousand", "Hundreds", "Only" };
		long[] value = { 10000000L, 100000, 1000, 100, 1 };
		for (int i = 0; i < value.length; i++) {
			int x1 = (int) (n / value[i]);
			n = n % value[i];
			if (x1 > 0) {
				if (x1 < 20) {
					word = word + unit[x1] + cvalue[i];
				} else {
					word = word + tens[x1 / 10] + unit[x1 % 10] + cvalue[i];
				}
			}
		}
		return word;

	}

}
