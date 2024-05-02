package tugas;
import java.util.Scanner;

class Person {
    protected String name;
    protected String address;
    protected String nim;
    protected String hobi;

    // Method untuk input name, address, dan nim
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        name = scanner.nextLine();
        System.out.print("Masukkan alamat: ");
        address = scanner.nextLine();
        System.out.print("Masukan nim: ");
        nim = scanner.nextLine();
        System.out.print("Masukkan hobi: ");
        hobi = scanner.nextLine();
    }

    // Method untuk menampilkan hobi
    public void tampilkanHobi() {
        System.out.println("Hobi: " + hobi);
    }
}
