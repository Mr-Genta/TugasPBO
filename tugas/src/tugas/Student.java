package tugas;
import java.util.Scanner;

class Student extends Person {
    private String nim;
    private double spp;
    private double sks;
    private double modul;

    // Method untuk menghitung pembayaran
    public void hitungPembayaran() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah SPP: ");
        spp = scanner.nextDouble();
        System.out.print("Masukkan jumlah SKS: ");
        sks = scanner.nextDouble();
        System.out.print("Masukkan harga Modul: ");
        modul = scanner.nextDouble();
        double total = (spp * sks) + modul;
        System.out.println("Total pembayaran: " + total);
    }
}
