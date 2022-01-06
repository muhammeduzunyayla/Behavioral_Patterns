import java.util.ArrayList;
import java.util.List;

public class Urun implements IMailSistemi{
    String urunAdi;
    int urunFiyat;
    public Urun(String urunAdi,int urunFiyat){
        this.urunAdi=urunAdi;
        this.urunFiyat=urunFiyat;
    }
    public List <IKatilimci> katilimcilar=new ArrayList<>();
    


    @Override
    public void TeklifVer(Kullanici kullanici, int teklif) {
        if (teklif>=urunFiyat){
            System.out.println(kullanici.isim+" kullanicisina fiyat degisimi "+ teklif + " mail olarak bildirildi");
            urunFiyat=teklif;
            for (IKatilimci katilimci:katilimcilar) {
                katilimci.mailHaberAl();

            }

        }



    }
}
