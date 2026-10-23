package model; 

public class BukuCetak extends Koleksi { 
    private int jumlahHalaman;
    private String nomorRak; 
    private boolean statusPerbaikan; 

  
    public BukuCetak(String kodeKoleksi, String judul, int tahunTerbit, int jumlahHalaman, String nomorRak, boolean statusPerbaikan) {
        super(kodeKoleksi, judul, tahunTerbit); 
        this.jumlahHalaman = jumlahHalaman; 
        this.nomorRak = nomorRak;
        this.statusPerbaikan = statusPerbaikan;
    }

    @Override 
    public String deskripsi() {
        return super.deskripsi() + " | " + jumlahHalaman + " halaman | Rak: " + nomorRak; 
    }

    @Override 
    public boolean layakDipinjam() {
        return !statusPerbaikan; // Layak DIPINJAM jika TIDAK sedang diperbaiki
    }
}