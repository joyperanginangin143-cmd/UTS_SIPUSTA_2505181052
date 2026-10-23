package model;

public class Majalah extends Koleksi { 
    
    private String edisi; 
    private String bulanTerbit; 
    private boolean edisiTerbaru; 

  
    public Majalah(String kodeKoleksi, String judul, int tahunTerbit, String edisi, String bulanTerbit, boolean edisiTerbaru) {
        super(kodeKoleksi, judul, tahunTerbit);
        this.edisi = edisi; 
        this.bulanTerbit = bulanTerbit;
        this.edisiTerbaru = edisiTerbaru;
    }

    @Override
    public String deskripsi() {
        return super.deskripsi() + " | Edisi " + edisi + " (" + bulanTerbit + ")";
    }

    @Override
    public boolean layakDipinjam() {
        return !edisiTerbaru; // Layak DIPINJAM jika BUKAN edisi terbaru.
    }
}