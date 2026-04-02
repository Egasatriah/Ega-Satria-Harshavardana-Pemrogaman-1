import java.util.Scanner;

public class Tugas1 {
        public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String nama = "", hobi = "", alamat = ""; 
            int usia = 0;                             

            System.out.print("Input Nama  : ");
            nama = input.nextLine();
            System.out.print("Input Umur  : ");
            usia = input.nextInt();
            input.nextLine();
            System.out.print("Input Hobi  : ");
            hobi = input.nextLine();
            System.out.print("Input Alamat : ");
            alamat = input.nextLine();

            System.out.println("Nama :" + nama);
            System.out.println("Umur :" + usia);
            System.out.println("Hobi :" + hobi);
            System.out.println("Alamat :" + alamat);
        }
    }
}