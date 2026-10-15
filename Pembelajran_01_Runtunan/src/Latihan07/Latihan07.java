package Latihan07;

import java.util.Scanner;

public class Latihan07 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama Lengkap: ");
        String nama = sc.nextLine();
        
       
        String hasil = nama.replaceAll("[aAeEiIoOuU]", "X");
        System.out.println("Hasil: " + hasil);
        
        sc.close();
    }
}
