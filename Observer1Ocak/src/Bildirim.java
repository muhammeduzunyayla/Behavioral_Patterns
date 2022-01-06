import java.util.ArrayList;
import java.util.List;

public class Bildirim implements IMesajSistemi{

    public List<IAbone>aboneler=new ArrayList<>();
    @Override
    public void KullaniciEkle(Kullanici kullanici) {
        aboneler.add(kullanici);

    }

    @Override
    public void KullaniciSil(Kullanici kullanici) {
        aboneler.remove(kullanici);

    }

    @Override
    public void haberEt(String mesaj) {
        for (IAbone abone:aboneler) {
            abone.haberal(mesaj);

        }

    }
}
