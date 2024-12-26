public class ArrayMaxFinder {
    public static int findMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0]; 
        }
        return Math.max(arr[n - 1], findMax(arr, n - 1));
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6}; // Array yang diperiksa

        int max = findMax(arr, arr.length);
        System.out.println("Nilai maksimum dalam array adalah: " + max);
    }
}