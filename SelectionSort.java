public class SelectionSort {

    public static void main(String[] args) {

        int arr[] = {64, 25, 12, 22, 11};

        // Selection sort logic
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i; // Assume first element is minimum

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;   // Update index of smallest element
                }
            }

            // Swap smallest with first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // Print sorted array
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
