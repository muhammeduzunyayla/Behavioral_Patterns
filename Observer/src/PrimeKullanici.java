import java.util.ArrayList;
import java.util.List;

public class PrimeKullanici implements  IUye{
     absUrun absUrun;
    private String isim;
    public List<absUrun> favoriList= new ArrayList<>();
    public PrimeKullanici(String isim,absUrun absUrun){
        this.isim=isim;
        this.absUrun=absUrun;

    }

    @Override
    public void update() {
         if(absUrun.get_Fiyat()<100){
             System.out.println("Ürün fiyatı 100 ün altında");
         }

    }
    public void favorilereEkle(absUrun urun){
        favoriList.add(urun);
    }
    public void favorilerdencikar(absUrun urun){
        favoriList.remove(urun);
    }
    public void favorilerigoster(){
        for (absUrun urunler:favoriList
             ) {
            System.out.println(urunler.Urunadi+urunler.get_Fiyat());


        }
    }
}
