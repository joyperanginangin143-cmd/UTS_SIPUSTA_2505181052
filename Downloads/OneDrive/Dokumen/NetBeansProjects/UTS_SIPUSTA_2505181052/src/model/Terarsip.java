package model;

public interface Terarsip {
   
    String getNomorRak(); 
    String getLokasiLantai(); 

    default String ringkasanArsip() {
        return "Lantai: " + getLokasiLantai() + " | Rak: " + getNomorRak() + " | ";
    }
}