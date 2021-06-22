public class BubbleSort {

	public static void main(String[] args) {
		int[] numbers = {7, 4, 5, 2};
		int length = numbers.length;
		
		int temp;
		for(int i = 0; i < length - 1; i++) {
			for(int j = 0; j < length - 1 - i; j++) {
				if(numbers[j] > numbers[j+1]) {
					temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}

		for(int number : numbers) {
			System.out.print(number + " ");
		}
	}

}
