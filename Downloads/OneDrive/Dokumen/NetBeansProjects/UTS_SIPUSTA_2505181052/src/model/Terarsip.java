package model;

public interface Terarsip {
   
    String nomorRak(); 
    String lokasiLantai(); 

    default String ringkasanArsip() {
        return "Lantai: " + lokasiLantai() + " | Rak: " + nomorRak() + " | ";
    }
}