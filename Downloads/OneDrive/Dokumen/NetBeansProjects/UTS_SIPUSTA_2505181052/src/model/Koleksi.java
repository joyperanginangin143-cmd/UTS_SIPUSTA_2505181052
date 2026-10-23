package model;

public abstract class Koleksi {
    
    protected String kodeKoleksi; 
    protected String judul; 
    protected int tahunTerbit; 

  
    public Koleksi(String kodeKoleksi, String judul, int tahunTerbit) {
        this.kodeKoleksi = kodeKoleksi; 
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public String deskripsi() {
        return kodeKoleksi + " - " + judul + " (" + tahunTerbit + ")"; 
    }

    public abstract boolean layakDipinjam(); 
    
    public String getJudul(){
        return judul;
    }
    
    public String getKodeKoleksi(){
        return kodeKoleksi;
    }
    
    public int getTahunTerbit(){
        return tahunTerbit;
    }
}