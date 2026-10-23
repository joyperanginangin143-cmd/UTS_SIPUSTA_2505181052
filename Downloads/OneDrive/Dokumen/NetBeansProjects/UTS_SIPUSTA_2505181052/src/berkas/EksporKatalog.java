package berkas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import model.Koleksi;

public class EksporKatalog {

    public void tulisKatalog(String namaBerkas, List<Koleksi> daftarKoleksi) throws IOException {
       
        try (PrintWriter tulis = new PrintWriter(new BufferedWriter(new FileWriter(namaBerkas)))) {
         
            
            tulis.println("------------------------------------------------------------------------");
            tulis.println("                    LAPORAN KATALOG PERPUSTAKAAN                       ");
            tulis.println("------------------------------------------------------------------------");
           
            tulis.println("");
            tulis.printf("%-10s %-26s %-14s %-14s%n", "KODE", "JUDUL", "TAHUN", "STATUS PINJAM");
            tulis.println("-----------------------------------------------------------------------");
            
           
            for (Koleksi k : daftarKoleksi) {
                String status = k.layakDipinjam() ? "BISA DIPINJAM" : "TIDAK BISA DIPINJAM";           
                tulis.printf("%-10s %-26s %-14s %-14s%n", 
                        k.getKodeKoleksi(), 
                        k.getJudul(), 
                        k.getTahunTerbit(), 
                        status);
            }
            
            tulis.println("-----------------------------------------------------------------------");
            tulis.println("Total Koleksi Terdaftar : " + daftarKoleksi.size() + " item");
            
        } 
    }
}


