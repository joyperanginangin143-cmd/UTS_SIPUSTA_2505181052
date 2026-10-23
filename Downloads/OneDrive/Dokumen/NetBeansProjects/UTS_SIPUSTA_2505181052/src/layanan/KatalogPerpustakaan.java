package layanan; 

import java.util.ArrayList;
import java.util.List; 
import model.Koleksi; 
import java.util.Comparator;

public class KatalogPerpustakaan { 
    
    private final List<Koleksi> daftarKoleksi = new ArrayList<>(); 
    
    public void tambahKoleksi(Koleksi koleksiBaru) { 
        daftarKoleksi.add(koleksiBaru); 
    }

    public void cetakStatus() { 
        System.out.println("------ STATUS KATALOG PERPUSTAKAAN -----"); 
        for (Koleksi k : daftarKoleksi) { 
            String status = k.layakDipinjam() ? "BISA DIPINJAM" : "TIDAK BISA DIPINJAM"; 
            System.out.println(k.deskripsi() + " | Status: " + status); 
        }
    }
    public List<Koleksi> urut(Comparator<Koleksi> pembanding) {
        List<Koleksi> urut = new ArrayList<>(daftarKoleksi);
        urut.sort(pembanding);
        return urut;
    }
    
    
}