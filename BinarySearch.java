public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;  // element found
            } 
            else if (key < arr[mid]) {
                high = mid - 1;  // search left
            } 
            else {
                low = mid + 1;   // search right
            }
        }

        return -1;  // not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 12, 20, 29}; // sorted array
        int key = 12;

        int result = binarySearch(arr, key);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);
    }
}
