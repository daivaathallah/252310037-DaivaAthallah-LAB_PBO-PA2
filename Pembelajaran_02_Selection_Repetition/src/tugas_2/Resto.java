package tugas_2;

import java.util.Scanner;

public class Resto {
	private long Harga;

    public void chooseMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu Sarapan:\n1. Nasi Goreng\n2. Bubur Ayam\n3. Soto Ayam");
        System.out.print("Pilih menu (1-3): ");
        int pilihan = input.nextInt();
        Harga = getPrices(pilihan);
    }

    private long getPrices(int pilihan) {
        long tempHarga = 0;
        if (pilihan == 1) {
            tempHarga = 22000;
        } else if (pilihan == 2) {
            tempHarga = 15000;
        } else if (pilihan == 3) {
            tempHarga = 25000;
        }
        return tempHarga;
    }
    
    public long getHarga() {
        return Harga;
    }
}
