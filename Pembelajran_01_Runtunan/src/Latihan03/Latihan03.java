package Latihan03;

import java.util.Scanner;

public class Latihan03 {
	
    static final double PI = 3.14159;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan digit terakhir NPM anda: ");
        int npmLastDigit = sc.nextInt();
        
       
        if (npmLastDigit % 2 != 0) {
            System.out.println("NPM Ganjil terdeteksi.");
            hitungSegitiga(sc);
            hitungKerucut(sc);
            hitungTabung(sc);
        } else {
            System.out.println("NPM Genap terdeteksi.");
            hitungLayangLayang(sc);
            hitungPrismaSegitiga(sc);
        }
        sc.close();
    }

    
    static void hitungSegitiga(Scanner sc) {
        System.out.println("\n-- Segitiga --");
        System.out.print("Masukkan alas: ");
        double alas = sc.nextDouble(); 
        System.out.print("Masukkan tinggi: ");
        double tinggi = sc.nextDouble();
        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga: " + luas);
    }

    static void hitungKerucut(Scanner sc) {
        System.out.println("\n-- Kerucut --");
        System.out.print("Masukkan jari-jari: ");
        double r = sc.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double t = sc.nextDouble();
        double volume = (1.0/3.0) * PI * r * r * t;
        System.out.println("Volume Kerucut: " + volume);
    }

    static void hitungTabung(Scanner sc) {
        System.out.println("\n-- Tabung --");
        System.out.print("Masukkan jari-jari: ");
        double r = sc.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double t = sc.nextDouble();
        double volume = PI * r * r * t;
        System.out.println("Volume Tabung: " + volume);
    }

    
    static void hitungLayangLayang(Scanner sc) {
        System.out.println("\n-- Layang-layang --");
        System.out.print("Masukkan diagonal 1: ");
        double d1 = sc.nextDouble();
        System.out.print("Masukkan diagonal 2: ");
        double d2 = sc.nextDouble();
        double luas = 0.5 * d1 * d2;
        System.out.println("Luas Layang-layang: " + luas);
    }

    static void hitungPrismaSegitiga(Scanner sc) {
        System.out.println("\n-- Prisma Segitiga --");
        System.out.print("Masukkan luas alas: ");
        double luasAlas = sc.nextDouble();
        System.out.print("Masukkan tinggi prisma: ");
        double t = sc.nextDouble();
        double volume = luasAlas * t;
        System.out.println("Volume Prisma Segitiga: " + volume);
    }
}
