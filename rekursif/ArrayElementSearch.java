public class ArrayElementSearch {
    public static boolean contains(int[] arr, int n, int target) {
        if (n <= 0) {
            return false; 
        }
        if (arr[n - 1] == target) {
            return true; 
        }
        return contains(arr, n - 1, target); 
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9}; // array untuk periksa
        int target = 5; // target

        boolean result = contains(arr, arr.length, target);
        System.out.println("Apakah array mengandung " + target + "? " + result);
    }
}
