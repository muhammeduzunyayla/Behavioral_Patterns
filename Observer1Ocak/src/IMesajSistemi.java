//Takip edilecek olan yapımızdır.
//İçerisinde Observer( değişimden etkilenecek) olan nesneleri tutar. Observable denk gelir
public interface IMesajSistemi {
    void KullaniciEkle(Kullanici kullanici);
    void KullaniciSil(Kullanici kullanici);
    void haberEt(String mesaj);
}
