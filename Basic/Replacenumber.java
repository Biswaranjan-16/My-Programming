package Basic;

public class Replacenumber {
	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6 };

		System.out.println("Original Array: ");
		printArray(numbers);

		for (int i = 2; i < numbers.length; i += 3) {
			numbers[i] = 0;
		}

		System.out.println("Modified Array: ");
		printArray(numbers);
	}

	public static void printArray(int[] array) {
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
