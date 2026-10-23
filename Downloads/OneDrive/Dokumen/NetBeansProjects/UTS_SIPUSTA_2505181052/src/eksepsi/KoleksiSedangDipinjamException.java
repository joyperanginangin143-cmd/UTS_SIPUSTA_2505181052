package eksepsi;

public class KoleksiSedangDipinjamException extends PustakaException{
    public KoleksiSedangDipinjamException(String judul) {
        super("Gagal: Koleksi '" + judul + "' saat ini masih dipinjam dan belum dikembalikan.");
    }
}
