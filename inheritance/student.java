package inheritance;
import java.util.*;

public class student extends person{
        String nim;
        int sks;
        int spp;
        int modul;

        // Method Getter
        public String getNim() {
            return nim;
        }

        //Overriding
        @Override
        public void identity() {
            System.out.println("NIM: " + getNim());
            super.identity();
            System.out.println("Tagihan: " + hitungPembayaran());
        }
        
        //Method hitungPembayaran
        public int hitungPembayaran(){
            int total;
            
            modul = modul*100000;
            total = sks*250000;
            return spp + total + modul;
            //Spp biasanya 2.250.000
        }
}