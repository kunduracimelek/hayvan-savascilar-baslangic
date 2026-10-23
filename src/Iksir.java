/**
 - İKSİR — Esya sınıfının bir ALT SINIFI

 - Kale 3 bu dosyayı bekliyor.

 - Esya.java dosyasını açıp okuyun: Iksir, Esya'nın alanlarını ve metotlarını kalıtımla alacak.

 */

// GÖREV 3a: Iksir sınıfı Esya sınıfından kalıtım alsın.
public class Iksir extends Esya {

    private int iyilestirme;

    public Iksir(int iyilestirme) {
        // GÖREV 3b: super(...) ile Esya'nın yapıcısını çağırın. Eşyanın adı "Can İksiri" olsun.
        super("Can İksiri");
        this.iyilestirme = iyilestirme;
    }

    // GÖREV 3c: Bu metot, Esya'daki kullan() metodunu geçersiz kılar (override).
    // İksir kullanılınca savaşçı iyileşsin: s.iyiles(iyilestirme);
    @Override
    public void kullan(Savasci s) {
        s.iyiles(iyilestirme);
    }

    public int getIyilestirme() {
        return iyilestirme;
    }
}