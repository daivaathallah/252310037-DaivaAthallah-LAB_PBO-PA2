package Latihan05;

import java.util.Scanner;

public class Latihan05 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kata/kalimat: ");
        String input = sc.nextLine();
        
        System.out.println("Hasil Uppercase: " + input.toUpperCase()); 
        sc.close();
    }
}
