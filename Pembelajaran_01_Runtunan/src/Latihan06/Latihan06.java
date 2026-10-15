package Latihan06;

import java.util.Scanner;

public class Latihan06 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Usia: ");
        String usia = sc.nextLine(); 
        
        System.out.print("Masukkan Firstname: ");
        String firstName = sc.nextLine();
        
        System.out.print("Masukkan Lastname: ");
        String lastName = sc.nextLine();
        
        System.out.print("Masukkan NPM: ");
        String npm = sc.nextLine();
        
        
        String output = usia.concat(firstName).concat(lastName).concat(npm);
        System.out.println("Hasil Concat: " + output);
        
        sc.close();
    }
}
