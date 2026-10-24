import model.*;
import layanan.*;
import java.util.List;
import eksepsi.*;
import berkas.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
    
    KatalogPerpustakaan katalog = new KatalogPerpustakaan();
    
    BukuCetak BK001 = new BukuCetak("BK-001", "Java How to Program", 2022, 620, "rak A-12", "Lantai 1", false);
    BukuCetak BK002 = new BukuCetak("BK-002", "Basis Data Relasional", 2021, 410, "rak B-04", "Lantai 1", true);
    
    Majalah MJ001 = new Majalah("MJ-001", "Info Teknologi Edisi 88", 2026, "edisi 88", "Agustus", "rak MJ-01", "Lantai 1", true);
    Majalah MJ002 = new Majalah("MJ-002", "Info Teknologi Edisi 87", 2026, "edisi 87", "Juli", "rak MJ-02", "Lantai 2",false);
   
    BerkasDigital BD001 = new BerkasDigital("BD-001", "Panduan Pemrograman Java", 2024, 15, "unduh.polmed.ac.id/bd001");
    BerkasDigital BD002 = new BerkasDigital("BD-002", "Jurnal Rekayasa Perangkat", 2025, 8, "unduh.polmed.ac.id/bd002");
    
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
    katalog.tambahKoleksi(BD002);
    
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
        
    System.out.println("========== PEMINJAMAN BARANG ==========");
    System.out.println("Meminjam BK-002 ");
    
        try {
            katalog.pinjam(BK002);
            
        } catch (PustakaException e) {
            // Akan menangkap KoleksiTidakLayakException
            System.out.println("DITOLAK: " + e.getMessage());
        }
        
        System.out.println("");
        //  meminjam koleksi yg bagus, lalu coba pinjam koleksi yang sama lagi
        System.out.println("Meminjam BK-001 ");
        try {
            katalog.pinjam(BK001); 
            System.out.println("");
            System.out.println(" Mencoba meminjam BK-001 LAGI untuk mahasiswa lain ");
            katalog.pinjam(BK001); // Hasilnya gagal karena BK-001 sudah dibawa keluar
            
        } catch (PustakaException e) {
            // Akan menangkap KoleksiSedangDipinjamException
            System.out.println("DITOLAK: " + e.getMessage());
        }
        
    System.out.println(" --------------- EKSPOR LAPORAN SIPUSTA  ----------------");
    EksporKatalog eksporKatalog = new EksporKatalog();
    try {
            eksporKatalog.tulisKatalog("katalog.txt", katalog.semuaKoleksi());
            System.out.println("SUKSES: File 'katalog.txt' berhasil di produksi");
        } catch (IOException e) {
            System.out.println("File .txt gagal di produksi: " + e.getMessage());
        }    
    }
}