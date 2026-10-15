package tugas_2;

import java.util.Scanner;

public class Latihan04 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai faktor (minimal 20): ");
        int faktor = input.nextInt();
        
        if (faktor < 20) {
            System.out.println("Nilai inputan factor tidak boleh kurang dari 20");
        } else {
            System.out.print("Masukkan NPM Anda: ");
            long npm = input.nextLong();
            
            if (npm % 2 == 0) {
                System.out.print("ASC: Faktor " + faktor + " adalah ");
                for (int i = 1; i <= faktor; i++) {
                    if (faktor % i == 0) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            } else {
                System.out.print("DESC: Faktor " + faktor + " adalah ");
                for (int i = faktor; i >= 1; i--) {
                    if (faktor % i == 0) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            }
        }
        input.close();
    }
}
