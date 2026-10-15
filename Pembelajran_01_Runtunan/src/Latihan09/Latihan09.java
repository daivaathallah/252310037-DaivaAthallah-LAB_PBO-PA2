package Latihan09;

import java.util.Scanner;

public class Latihan09 {
	static Students myBio = new Students();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan NPM: ");
        Integer npm = myBio.getNPM(sc.nextInt());
        sc.nextLine();
        
        System.out.print("Masukkan Fullname: ");
        String nama = myBio.getFullname(sc.nextLine());
        
        System.out.print("Masukkan ClassName: ");
        String kelas = myBio.getClassName(sc.nextLine());
        
        System.out.print("Masukkan Semester: ");
        Integer semester = myBio.getSemester(sc.nextInt());
        
        System.out.print("Masukkan GPA: ");
        Float gpa = myBio.getGPA(sc.nextFloat());
        
        System.out.print("\n=== Data Student ===\n");
        System.out.print("NPM: " + npm + "\n");
        System.out.print("Nama: " + nama + "\n");
        System.out.print("Kelas: " + kelas + "\n");
        System.out.print("Semester: " + semester + "\n");
        System.out.print("GPA: " + gpa + "\n");
        
        sc.close();
    }
}
