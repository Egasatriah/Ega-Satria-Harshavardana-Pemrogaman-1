package Tugas2;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("Program Hitung Ongkos Kirim Paket: ");
        System.out.println("================================");

        System.out.println("Masukkan Berat Paket (kg): ");
        double beratPaket = input.nextDouble();

        System.out.println("Masukkan Jarak Pengiriman (km): ");
        double jarakPengiriman = input.nextDouble();  

        double hargaPerKg = 5000; 
        double hargaPerKm = 2000; 
        double ongkir     = beratPaket * hargaPerKg;
        double biayaJarak = jarakPengiriman * hargaPerKm;
        double totalOngkir = ongkir + biayaJarak;

        System.out.println("===============================");
        System.out.println("Rincian Biaya Pengiriman: ");
        System.out.println("===============================");

        System.out.println("Berat Paket: " + beratPaket + " kg");
        System.out.println("Jarak Pengiriman: " + jarakPengiriman + " km");
        System.out.println("Biaya per kg: Rp " + hargaPerKg);
        System.out.println("Biaya per km: Rp " + hargaPerKm);

        System.out.println("------------------------------");
        System.out.println("Biaya Berat: Rp " + ongkir);
        System.out.println("Biaya Jarak: Rp " + biayaJarak);
        System.out.println("------------------------------");   

        System.out.println("Total Ongkos Kirim: Rp " + totalOngkir);
        System.out.println("===============================");
        System.out.println(" Paket segera dikirim!! Terima kasih telah menggunakan layanan kami!");
        System.out.println("===============================");

        input.close();
    }
    
}
