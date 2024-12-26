public class SumOfThree {
    public static int sumOfThree(int n, int[] initial) {
        if (n < 3) {
            return initial[n];
        }
        return sumOfThree(n - 1, initial) + sumOfThree(n - 2, initial) + sumOfThree(n - 3, initial);
    }

    public static void main(String[] args) {
        int n = 10; 
        int[] initial = {0, 1, 1}; 

        System.out.println("Deret SumOfThree:");
        for (int i = 0; i < n; i++) {
            System.out.print(sumOfThree(i, initial) + " ");
        }
    }
}
