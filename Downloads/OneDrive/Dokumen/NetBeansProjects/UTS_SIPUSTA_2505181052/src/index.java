import model.*;
public class index {
    public static void main(String[] args){
    BukuCetak BK001 = new BukuCetak("BK-001", "Java How to Program", 2022, 620, "rak A-12", false);
    BukuCetak BK002 = new BukuCetak("BK-002", "Basis Data Relasional", 2021, 410, "rak B-04", true);
    
    Majalah MJ001 = new Majalah("MJ-001", "Info Teknologi Edisi 88", 2026, "edisi 88", "Agustus", true);
    Majalah MJ002 = new Majalah("MJ-002", "Info Teknologi Edisi 87", 2026, "edisi 87", "Juli", false);
   
    BerkasDigital BD001 = new BerkasDigital("BD-001", "Panduan Pemrograman Java", 2025, 8, "unduh.polmed.ac.id/bd002");
    BerkasDigital BD002 = new BerkasDigital("BD-001", "Panduan Pemrograman Java", 2025, 8, "unduh.polmed.ac.id/bd002");
    
    System.out.println(BK001.deskripsi() + " | Kelayakan Pinjam : " + BK001.layakDipinjam());
    System.out.println(BK002.deskripsi() + " | Kelayakan Pinjam : " + BK002.layakDipinjam());
    
    System.out.println(MJ001.deskripsi() + " | Kelayakan Pinjam : " + MJ001.layakDipinjam());
    System.out.println(MJ002.deskripsi() + " | Kelayakan Pinjam : " + MJ002.layakDipinjam());
    
    System.out.println(BD001.deskripsi() + " | Kelayakan Pinjam : " + BD001.layakDipinjam());
    System.out.println(BD002.deskripsi() + " | Kelayakan Pinjam : " + BD002.layakDipinjam());
}
}
