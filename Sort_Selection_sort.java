package Program_practise;

public class Sort_Selection_sort {

	void function(int arr[]) {
		int index;

		for (int i = 0; i < arr.length; i++) {
			index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;

				}

			}

			int arrysmal_number = arr[index];
			arr[index] = arr[i];
			arr[i] = arrysmal_number;
		}

	}

	public static void main(String[] args) {

		int arr[] = { 1, 6, 2, 3, 4, 9, 7, 2, 4, 1, 4, 6 };
		Sort_Selection_sort obj = new Sort_Selection_sort();
		System.out.println("array before sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		obj.function(arr);
		System.out.println("array after sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}
