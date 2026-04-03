package Tugas1;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double makananWarteg1; double transportBus1; double belanjaBulanan1;
        System.out.println("Total Harga Makanan Warteg 1: ");
        makananWarteg1 = input.nextDouble();
        System.out.println("Total Harga Transport Bus 1: ");
        transportBus1 = input.nextDouble();
        System.out.println("Total Harga Belanja Bulanan 1: ");
        belanjaBulanan1 = input.nextDouble();
        double total1 = makananWarteg1 + transportBus1 + belanjaBulanan1;

        double presentaseMakananWarteg1; double presentaseTransportBus1; double presentaseBelanjaBulanan1;
        presentaseMakananWarteg1 = makananWarteg1/total1 * 100;
        presentaseTransportBus1 = transportBus1/total1 * 100;
        presentaseBelanjaBulanan1 = belanjaBulanan1/total1 * 100;

        System.out.println("><><><><><><><");
        System.out.println("Hasil Presentase Makanan Warteg 1:" + presentaseMakananWarteg1 + "%");
        System.out.println("Hasil Presentase Transport Bus 1:" + presentaseTransportBus1 + "%");
        System.out.println("Hasil Presentase Belanja Bulanan 1:" + presentaseBelanjaBulanan1 + "%");
        System.out.println("><><><><><><><");

        double makananWarteg2; double transportBus2; double belanjaBulanan2;
        System.out.println("Total Harga Makanan Warteg 2: ");
        makananWarteg2 = input.nextDouble();
        System.out.println("Total Harga Transport Bus 2: ");
        transportBus2 = input.nextDouble();
        System.out.println("Total Harga Belanja Bulanan 2: ");
        belanjaBulanan2 = input.nextDouble();
        double total2 = makananWarteg2 + transportBus2 + belanjaBulanan2;

        double presentaseMakananWarteg2; double presentaseTransportBus2; double presentaseBelanjaBulanan2;
        presentaseMakananWarteg2 = makananWarteg2/total2 * 100;
        presentaseTransportBus2 = transportBus2/total2 * 100;
        presentaseBelanjaBulanan2 = belanjaBulanan2/total2 * 100;

        System.out.println("><><><><><><><");
        System.out.println("Hasil Presentase Makanan Warteg 2:" + presentaseMakananWarteg2 + "%");
        System.out.println("Hasil Presentase Transport Bus 2:" + presentaseTransportBus2 + "%");
        System.out.println("Hasil Presentase Belanja Bulanan 2:" + presentaseBelanjaBulanan2 + "%");
        System.out.println("><><><><><><><");

        double makananWarteg3; double transportBus3; double belanjaBulanan3;
        System.out.println("Total Harga Makanan Warteg 3: ");
        makananWarteg3 = input.nextDouble();
        System.out.println("Total Harga Transport Bus 3: ");
        transportBus3 = input.nextDouble();
        System.out.println("Total Harga Belanja Bulanan 3: ");
        belanjaBulanan3 = input.nextDouble();
        double total3 = makananWarteg3 + transportBus3 + belanjaBulanan3;

        double presentaseMakananWarteg3; double presentaseTransportBus3; double presentaseBelanjaBulanan3;
        presentaseMakananWarteg3 = makananWarteg3/total3 * 100;
        presentaseTransportBus3 = transportBus3/total3 * 100;
        presentaseBelanjaBulanan3 = belanjaBulanan3/total3 * 100;

        System.out.println("><><><><><><><");
        System.out.println("Hasil Presentase Makanan Warteg 3:" + presentaseMakananWarteg3 + "%");
        System.out.println("Hasil Presentase Transport Bus 3:" + presentaseTransportBus3 + "%");
        System.out.println("Hasil Presentase Belanja Bulanan 3:" + presentaseBelanjaBulanan3 + "%");
        System.out.println("><><><><><><><");
    }
}
