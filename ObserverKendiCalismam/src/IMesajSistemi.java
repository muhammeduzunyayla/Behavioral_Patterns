//Takip edilecek olan yapımızdır
//İçerisinde Observer (değişimden etkilenecek) nesneleri tutar. Observable'e denl gelir
public interface IMesajSistemi {
void kullaniciEkle(Kullanici kullanici);
void kullaniciCikar(Kullanici kullanici);
void mesajGonder(String mesaj);

}
