import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args[]) {
        Scanner input = new Scanner(System.in);
            String nama; int usia;
            System.out.print("Input Nama : ");
            nama = input.nextLine();     
            System.out.print("Input Umur : ");
            usia = input.nextInt();

            int TahunLahir = 2026 - usia;

            System.out.println("Nama : " + nama);
            System.out.println("Umur : " + usia);
            System.out.println("Tahun Lahir : " + TahunLahir);  
    }
    
}
