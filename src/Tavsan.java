/**
 - TAVŞAN — Savasci sınıfının bir ALT SINIFI

 - Kale 2 ve Kale 4 bu dosyayı bekliyor.

 - Yalnızca oyunda seçtiğiniz hayvanın dosyasını doldurmanız yeterlidir.

 */

// GÖREV 2a: Tavsan sınıfı Savasci sınıfından kalıtım alsın.
public class Tavsan extends Savasci {

    public Tavsan(String isim) {
        // GÖREV 2b: super(...) ile üst sınıfın (Savasci) yapıcısını çağırın.
        // Tavşan'ın canı 80, gücü 12.
        super(isim, 80, 12);
    }

    // GÖREV 4a: Bu metot, Savasci'daki tanit() metodunu geçersiz kılar (override).
    @Override
    public String tanit() {
        return super.tanit() + ", ormanın en hızlısı!";
    }

    // GÖREV 4b: Bu metot, Savasci'daki saldir() metodunu geçersiz kılar.
    // Tavşan'ın saldırısı normal saldırının 2 katıdır.
    @Override
    public int saldir() {
        return super.saldir() * 2;
    }
}