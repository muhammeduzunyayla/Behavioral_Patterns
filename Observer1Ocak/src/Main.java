public class Main {

    public static void main(String[] args) {
	Kullanici muhammed=new Kullanici();
    Kullanici mehmet=new Kullanici();
    Kullanici ayse=new Kullanici();

    Bildirim bildirim=new Bildirim();
    bildirim.KullaniciEkle(muhammed);
    bildirim.KullaniciEkle(mehmet);
    bildirim.KullaniciEkle(ayse);
        bildirim.KullaniciSil(muhammed);
    bildirim.haberEt("Bu bir bildirimdir.");

    Sms sms=new Sms();
    sms.KullaniciEkle(muhammed);
    sms.haberEt("Bu bir smsdir");
    }
}
