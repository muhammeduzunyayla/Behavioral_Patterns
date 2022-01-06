import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class absUrun {
    public String Urunadi;
    private int _Fiyat;

    public List<IUye> TakipList = new ArrayList<>();


    public absUrun(String Urunad, int UrunFiyat) {
        this._Fiyat = UrunFiyat;
        this.Urunadi = Urunad;
    }
    public void add(IUye iUye){
        TakipList.add(iUye);
    }
    public void remove(IUye iUye){
        TakipList.remove(iUye);
    }
    public void bildir(){
        System.out.println("Ürün fiyatı degisti");
        for (IUye iuye:TakipList ){

           iuye.update();

        }
    }



    public int get_Fiyat() {
        return _Fiyat;
    }

    public void set_Fiyat(int _Fiyat) {

        this._Fiyat = _Fiyat;
    }
}


