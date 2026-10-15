package Latihan04;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Latihan04 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukan jumlah produk yang dibeli : ");
        int qty = sc.nextInt();
        
        int hargaSatuan = 6300;
        int totalHarga = qty * hargaSatuan;
        double diskon = 0;
        
       
        if (qty > 0 && qty % 3 == 0) {
            diskon = totalHarga * 0.05; 
        }
        
        double subTotal = totalHarga - diskon;
        
        
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");
        
        DecimalFormat kursIndo = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndo.setDecimalFormatSymbols(formatRp);

        System.out.println("\nTOKO SERBAGUNA IBIK");
        System.out.println(dtf.format(now));
        System.out.println("ITEM\t\tQTY\t\tHARGA\t\tTOTAL");
        System.out.println("======================================================");
        System.out.println("ROTI ENAK.\t" + qty + "\t\t" + kursIndo.format(hargaSatuan) + "\t" + kursIndo.format(totalHarga));
        System.out.println("------------------------------------------------------");
        
        if (diskon > 0) {
            System.out.println("Diskon : 5%");
        } else {
            System.out.println("Diskon : 0%");
        }
        
        System.out.println("Sub Total : " + kursIndo.format(subTotal));
        
        sc.close();
    }
}
