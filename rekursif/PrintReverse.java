public class PrintReverse {
    public static void printReverse(int n) {
        if (n < 1) {
            return;
        }
        System.out.print(n + " "); 
        printReverse(n - 1); 
    }

    public static void main(String[] args) {
        int n = 10; 
        System.out.println("Cetak angka mundur dari " + n + ":");
        printReverse(n);
    }
}