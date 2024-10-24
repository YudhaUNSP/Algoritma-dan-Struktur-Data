package programsederhana;

import java.util.Scanner;

public class KornversiSuhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan suhu dalam Celcius: ");
        double suhuCelcius = scanner.nextDouble();
        double suhuFahrenheit = (suhuCelcius * 9/5) + 32;
        System.out.println("Suhu dalam Fahrenheit: " + suhuFahrenheit);
        scanner.close();
    }
}
