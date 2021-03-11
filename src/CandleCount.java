
public class CandleCount {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 1, 3, 6, 8, 7, 1, 8, 8 };
		int max = -1;
		int count = 0;

		for (int i : arr) {
			// System.out.println(max + " " + arr[i]);
			if (i >= max) {
				System.out.println(max + " " + i);
				if (i == max) {

					count++;
				} else {
					max = i;
					count = 1;
				}
			}
		}
		System.out.println(count);
	}
}
