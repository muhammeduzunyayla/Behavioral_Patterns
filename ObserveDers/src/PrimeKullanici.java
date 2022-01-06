import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class PrimeKullanici implements  IUye{
    protected absUrun absUrun;
    private String isim;
    public List<absUrun> favoriList= new ArrayList<>();
    public PrimeKullanici(String isim){
        this.isim=isim;

    }
    @Override
    public void update(absUrun urun) {
        if(absUrun._Fiyat<100){
            System.out.println("Ürün fiyatı 100 ün altında");
        }

    }
}
