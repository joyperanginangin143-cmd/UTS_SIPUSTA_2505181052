package layanan; 

import java.util.Comparator; 

import model.Koleksi; 
public class UrutLayakLaluJudul implements Comparator<Koleksi> {
       
    @Override
    public int compare(Koleksi a, Koleksi b) {
 
        int bandingkanStatus = Boolean.compare(b.layakDipinjam(), a.layakDipinjam());
        
        if (bandingkanStatus != 0) {
            return bandingkanStatus;
        }
        
        return a.getJudul().compareToIgnoreCase(b.getJudul());
    }
}