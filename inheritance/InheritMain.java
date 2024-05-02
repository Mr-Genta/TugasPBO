package inheritance;
import java.util.*;

public class InheritMain {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        student mahasiswa = new student();

        System.out.print("Masukkan NIM: ");
        mahasiswa.nim = inp.next();
        System.out.print("Masukkan Nama: ");
        mahasiswa.name = inp.next();
        System.out.print("Masukkan Alamat: ");
        mahasiswa.address = inp.next();
        System.out.print("Masukkan SPP: ");
        mahasiswa.spp = inp.nextInt();
        System.out.print("Masukkan SKS: ");
        mahasiswa.sks = inp.nextInt();
        System.out.print("Masukkan Modul: ");
        mahasiswa.modul = inp.nextInt();
        System.out.print("Masukkan hobi: ");
        mahasiswa.hobi = inp.next();
        mahasiswa.identity();
        mahasiswa.hobi();
    }
}