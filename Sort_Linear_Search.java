package Program_practise;

public class Sort_Linear_Search {

	void function(int ar[], int key) {
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == key) {
				System.out.println("index is :- " + i);
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int key = 7;
		Sort_Linear_Search obj = new Sort_Linear_Search();

		obj.function(arr, key);
	}

}
