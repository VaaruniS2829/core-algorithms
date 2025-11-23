public class InsertionSort {

    public static void main(String[] args) {

        int arr[] = {5, 2, 9, 1, 6};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];   // Current element
            int j = i - 1;

            // Move elements that are greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;  // Insert key at correct position
        }

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
