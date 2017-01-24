public class SelectionSort {

	public static Integer[] sort(Integer[] sequence) {
		int n = sequence.length;
		int index = 0;
		int min = 0;
		for (int i = 0; i < n; i++) {
			min = sequence[i];
			for (int j = i; j < n; j++)
				if (sequence[j] < min) {
					min = sequence[j];
					index = j;
				}
			if (sequence[i] > min) {
				sequence[index] = sequence[i];
				sequence[i] = min;
			}
		}
		return sequence;
	}

	public static void main(String[] argv) {

		Integer[] seq = { 4, 6, 1, 0, -3, 55, 0, 1, -144 };
		SelectionSort.sort(seq);
		for (int i = 0; i < seq.length; i++)
			System.out.print(seq[i] + " ");

	}

}
