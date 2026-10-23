import model.*;
import layanan.*;
import java.util.List;

public class index {
    public static void main(String[] args){
    
    KatalogPerpustakaan katalog = new KatalogPerpustakaan();
    
    BukuCetak BK001 = new BukuCetak("BK-001", "Java How to Program", 2022, 620, "rak A-12", "Lantai 1", false);
    BukuCetak BK002 = new BukuCetak("BK-002", "Basis Data Relasional", 2021, 410, "rak B-04", "Lantai 1", true);
    
    Majalah MJ001 = new Majalah("MJ-001", "Info Teknologi Edisi 88", 2026, "edisi 88", "Agustus", "rak MJ-01", "Lantai 1", true);
    Majalah MJ002 = new Majalah("MJ-002", "Info Teknologi Edisi 87", 2026, "edisi 87", "Juli", "rak MJ-02", "Lantai 2",false);
   
    BerkasDigital BD001 = new BerkasDigital("BD-001", "Panduan Pemrograman Java", 2025, 8, "unduh.polmed.ac.id/bd002");
    BerkasDigital BD002 = new BerkasDigital("BD-001", "Panduan Pemrograman Java", 2025, 8, "unduh.polmed.ac.id/bd002");
    
    System.out.println(BK001.deskripsi() + " | " + BK001.ringkasanArsip() + " Kelayakan Pinjam : " + BK001.layakDipinjam());
    System.out.println(BK002.deskripsi() + " | " + BK002.ringkasanArsip() + " Kelayakan Pinjam : " + BK002.layakDipinjam());
    

    System.out.println(MJ001.deskripsi() + " | " + MJ001.ringkasanArsip() + "  Kelayakan Pinjam : " + MJ001.layakDipinjam());
    System.out.println(MJ002.deskripsi() + " | " + MJ002.ringkasanArsip() + "  Kelayakan Pinjam : " + MJ002.layakDipinjam());
    
    System.out.println(BD001.deskripsi() + " |  Kelayakan Pinjam : " + BD001.layakDipinjam());
    System.out.println(BD002.deskripsi() + " |  Kelayakan Pinjam : " + BD002.layakDipinjam());
   
    System.out.println(" ------------------------------------------------ ---------");
    System.out.println(" ---------------------------------------------------------");
    katalog.tambahKoleksi(BK001);
    katalog.tambahKoleksi(BK002);
    katalog.tambahKoleksi(MJ001);
    katalog.tambahKoleksi(MJ002);
    katalog.tambahKoleksi(BD001);
    katalog.tambahKoleksi(BD001);
    
    katalog.cetakStatus();
    
    System.out.println(" ---------------------------------------------------------");
    System.out.println(" ---------------------------------------------------------");
   
    System.out.println("");
    System.out.println("=========== DAFTAR KOLEKSI ===========");
        List<Koleksi> daftarYangSudahDiurutkan = katalog.urut(new UrutLayakLaluJudul());
       
        for (Koleksi k : daftarYangSudahDiurutkan) {
            String status = k.layakDipinjam() ? "BISA DIPINJAM" : "TIDAK BISA DIPINJAM";
            System.out.println(k.deskripsi() + " | Status: " + status);
        }
    }
}

