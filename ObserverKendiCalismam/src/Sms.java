import java.util.ArrayList;
import java.util.List;

public class Sms implements IMesajSistemi{
    public List<IAbone> kullanicilar = new ArrayList<>();
    @Override
    public void kullaniciEkle(Kullanici kullanici) {
        kullanicilar.add(kullanici);
    }

    @Override
    public void kullaniciCikar(Kullanici kullanici) {
         kullanicilar.remove(kullanici);
    }

    @Override
    public void mesajGonder(String mesaj) {
        for (IAbone abone:kullanicilar
        ) {
            abone.mesajAl(mesaj);
        }
    }
}
