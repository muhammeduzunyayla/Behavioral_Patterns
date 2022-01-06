import java.util.ArrayList;
import java.util.List;

public abstract class absUrun {
 public String Urunadi;
 protected int _Fiyat;

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
  for (IUye iuye:TakipList) {
   iuye.update(this);

  }

 }

}
