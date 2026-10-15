package Latihan01;

import java.util.Scanner;

public class Latihan01 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan suhu dalam Celcius: ");
       
        if (!input.hasNextDouble()) {
            System.out.println("Error: Masukkan format angka yang benar!");
            return;
        }
        
       
        double celcius = input.nextDouble();
        double fahrenheit = (9.0 / 5.0 * celcius) + 32;
        double reamur = (4.0 / 5.0 * celcius);
        double kelvin = celcius + 273.15;
        
        System.out.println("=== Hasil Konversi Suhu ===");
        System.out.println("Celcius    : " + celcius + " C");
        System.out.println("Fahrenheit : " + fahrenheit + " F");
        System.out.println("Reamur     : " + reamur + " R");
        System.out.println("Kelvin     : " + kelvin + " K");
        
        input.close();
    }
}
