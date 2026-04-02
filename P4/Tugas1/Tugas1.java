package Tugas1;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double makanan; double transport; double belanja;
        System.out.println("Total Harga Makanan: ");
        makanan = input.nextDouble();
        System.out.println("Total Harga Transport: ");
        transport = input.nextDouble();
        System.out.println("Total Harga Belanja: ");
        belanja = input.nextDouble();
        double total = makanan + transport + belanja;

        double presentaseMakanan; double presentaseTransport; double presentaseBelanja;
        presentaseMakanan = makanan/total * 100;
        presentaseTransport = transport/total * 100;
        presentaseBelanja = belanja/total * 100;

        System.out.println("><><><><><><><");
        System.out.println("Hasil Presentase Makanan:" + presentaseMakanan + "%");
        System.out.println("Hasil Presentase Transport:" + presentaseTransport + "%");
        System.out.println("Hasil Presentase Belanja:" + presentaseBelanja + "%");
        System.out.println("><><><><><><><");

        double makanan1; double transport1; double belanja1;
        System.out.println("Total Harga Makanan1: ");
        makanan1 = input.nextDouble();
        System.out.println("Total Harga Transport1: ");
        transport1 = input.nextDouble();
        System.out.println("Total Harga Belanja: ");
        belanja1 = input.nextDouble();
        double total1 = makanan1 + transport1 + belanja1;

        double presentaseMakanan1; double presentaseTransport1; double presentaseBelanja1;
        presentaseMakanan1 = makanan1/total1 * 100;
        presentaseTransport1 = transport1/total1 * 100;
        presentaseBelanja1 = belanja1/total1    * 100;

        System.out.println("><><><><><><><");
        System.out.println("Hasil Presentase Makanan1:" + presentaseMakanan1 + "%");
        System.out.println("Hasil Presentase Transport1:" + presentaseTransport1 + "%");
        System.out.println("Hasil Presentase Belanja1  :" + presentaseBelanja1 + "%");
        System.out.println("><><><><><><><");

        double makanan2; double transport2; double belanja2;
        System.out.println("Total Harga Makanan2: ");
        makanan2 = input.nextDouble();
        System.out.println("Total Harga Transport2: ");
        transport2 = input.nextDouble();
        System.out.println("Total Harga Belanja2: ");
        belanja2 = input.nextDouble();
        double total2 = makanan2 + transport2 + belanja2     ;

        double presentaseMakanan2; double presentaseTransport2; double presentaseBelanja2;
        presentaseMakanan2 = makanan2/total2 * 100;
        presentaseTransport2 = transport2/total2 * 100;
        presentaseBelanja2 = belanja2/total2 * 100;

        System.out.println("><><><><><><><");
        System.out.println("Hasil Presentase Makanan2:" + presentaseMakanan2 + "%");
        System.out.println("Hasil Presentase Transport2:" + presentaseTransport2 + "%");
        System.out.println("Hasil Presentase Belanja2  :" + presentaseBelanja2 + "%");
        System.out.println("><><><><><><><");
    }
}
