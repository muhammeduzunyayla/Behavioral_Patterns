public class Main {

    public static void main(String[] args) {
	Kullanici omer =new Kullanici();
    Kullanici nisa =new Kullanici();
    Kullanici baris=new Kullanici();
    Kullanici ayse =new Kullanici();

    Bildirim bildirim=new Bildirim();
    bildirim.kullaniciEkle(omer);
    bildirim.kullaniciEkle(nisa);
    bildirim.kullaniciEkle(baris);
    bildirim.kullaniciEkle(ayse);

    bildirim.mesajGonder("Bu bir bildirim mesajıdır");

    bildirim.kullaniciCikar(nisa);
    bildirim.kullaniciCikar(ayse);

    bildirim.mesajGonder("Bu bir bildirim mesajıdır");

    Sms sms=new Sms();
    sms.kullaniciEkle(ayse);
    sms.kullaniciEkle(nisa);

    sms.mesajGonder("Bu bir sms mesajıdır");

    }
}
