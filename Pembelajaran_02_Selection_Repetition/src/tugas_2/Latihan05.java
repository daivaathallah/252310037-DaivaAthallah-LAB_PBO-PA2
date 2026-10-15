package tugas_2;

import java.util.Scanner;

public class Latihan05 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int row = input.nextInt();

        int i = 1;
        while (i <= row) {
            int j = 1;
            while (j <= row) {
                if (i == 1 || i == row || j == 1 || j == row || i == j || j == (row - i + 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
        input.close();
    }
}
