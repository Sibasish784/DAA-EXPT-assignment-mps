//Implementation of linear search
public class linearSearch {


    public static int search(int[] arr, int key) {
        // Loop through the array and check each element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Key found, return its index
            }
        }
        return -1; // Key not found, return -1
    }

    public static void main(String[] args) {
        int[] arr = {48, 47, 44, 4, 7, 8, 1};
        int key = 7;
        int index = search(arr, key);
        if (index == -1) {
            System.out.println("Key not found.");
        } else {
            System.out.println("Key found at index " + index);
        }
    }
}




