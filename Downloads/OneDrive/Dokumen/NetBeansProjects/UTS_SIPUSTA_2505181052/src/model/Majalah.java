package model;

public class Majalah extends Koleksi implements Terarsip { 
    
    private String edisi; 
    private String bulanTerbit;
    private String nomorRak;
    private String lokasiLantai;
    private boolean edisiTerbaru; 

  
    public Majalah(String kodeKoleksi, String judul, int tahunTerbit, 
                    String edisi, String bulanTerbit,String nomorRak, String lokasiLantai, boolean edisiTerbaru) {
        super(kodeKoleksi, judul, tahunTerbit);
        this.edisi = edisi; 
        this.bulanTerbit = bulanTerbit;
        this.nomorRak = nomorRak;
        this.lokasiLantai = lokasiLantai;
        this.edisiTerbaru = edisiTerbaru;
    }

    @Override
    public String deskripsi() {
        return super.deskripsi() + " | Edisi " + edisi + " | Bulan terbit : " + bulanTerbit;
    }

    @Override
    public boolean layakDipinjam() {
        return !edisiTerbaru; // Layak DIPINJAM jika BUKAN edisi terbaru.
    }
    
    @Override
    public String nomorRak() {
        return this.nomorRak;
    }

    @Override
    public String lokasiLantai() {
        return this.lokasiLantai;
    }
}