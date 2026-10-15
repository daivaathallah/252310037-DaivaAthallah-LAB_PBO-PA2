package tugas_2;

import java.util.Scanner;

public class Latihan10 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long pinBenar = 252310037; 
        long saldo = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Masukan PIN: ");
            long pinInput = input.nextLong();
            if (pinInput == pinBenar) {
                isValid = true;
            } else {
                System.out.println("PIN salah!");
            }
        }

        char lanjut = 'y';
        while (lanjut == 'y' || lanjut == 'Y') {
            System.out.println("\nMenu ATM:\n1. Lihat Saldo\n2. Setor Tunai\n3. Tarik Tunai\n4. Keluar");
            System.out.print("Masukan menu: ");
            int menu = input.nextInt();

            if (menu == 1) {
                System.out.println("Show Saldo: " + saldo);
            } else if (menu == 2) {
                System.out.print("Masukan Nominal Setor Tunai: ");
                long setor = input.nextLong();
                saldo = saldo + setor;
                System.out.println("Show Saldo: " + saldo);
            } else if (menu == 3) {
                System.out.print("Masukan Nominal Tarik Tunai: ");
                long tarik = input.nextLong();
                if (tarik <= saldo) {
                    saldo = saldo - tarik;
                    System.out.println("Show Saldo: " + saldo);
                } else {
                    System.out.println("Saldo tidak cukup");
                }
            } else if (menu == 4) {
                break;
            }

            System.out.print("Masukan konfirmasi keluar aplikasi (y/n)? ");
            char konfirm = input.next().charAt(0);
            if (konfirm == 'y' || konfirm == 'Y') {
                lanjut = 'n'; 
            } else {
                lanjut = 'y'; 
            }
        }
        input.close();
    }
}
