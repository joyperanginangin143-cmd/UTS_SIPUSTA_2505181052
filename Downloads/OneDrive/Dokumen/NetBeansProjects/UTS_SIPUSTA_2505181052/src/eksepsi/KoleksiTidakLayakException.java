package eksepsi;

public class KoleksiTidakLayakException extends PustakaException {
    public KoleksiTidakLayakException(String judul) {
        super("Maaf, koleksi '" + judul + "' saat ini tidak layak dipinjam. (Mungkin rusak/edisi terbaru).");
    }
}
