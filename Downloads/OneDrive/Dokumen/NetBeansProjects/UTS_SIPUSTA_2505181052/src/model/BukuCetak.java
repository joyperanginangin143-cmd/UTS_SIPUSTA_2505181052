package model; 

public class BukuCetak extends Koleksi implements Terarsip { 
    
    private int jumlahHalaman;
    private String nomorRak; 
    private boolean statusPerbaikan; 
    private String lokasiLantai;
  
    public BukuCetak(String kodeKoleksi, String judul, int tahunTerbit, int jumlahHalaman, 
                        String nomorRak,String lokasiLantai, boolean statusPerbaikan) {
        super(kodeKoleksi, judul, tahunTerbit); 
        this.jumlahHalaman = jumlahHalaman; 
        this.nomorRak = nomorRak;
        this.lokasiLantai = lokasiLantai;
        this.statusPerbaikan = statusPerbaikan;
    }

    @Override 
    public String deskripsi() {
        return super.deskripsi() + " | " + jumlahHalaman + " halaman | Rak: " + nomorRak; 
    }

    @Override 
    public boolean layakDipinjam() {
        return !statusPerbaikan;
    }
    
    @Override
    public String getNomorRak() {
        return this.nomorRak; 
    }

    @Override 
    public String getLokasiLantai() {
        return this.lokasiLantai;
    }
    

    public String getJudul(){
        return super.judul;}
   
}