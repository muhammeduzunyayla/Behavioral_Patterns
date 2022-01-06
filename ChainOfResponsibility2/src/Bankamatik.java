import java.util.ArrayList;
import java.util.List;

public class Bankamatik {
    Para200 _200=new Para200();
    Para100 _100=new Para100();
    Para50 _50=new Para50();
    Para20 _20=new Para20();
    Para10 _10=new Para10();
    Para5 _5=new Para5();
    Para1 _1 =new Para1();
    public List<Miktar> ParaCek(int tutar){
        System.out.println("Toplam Tutar:"+ tutar);
        _200.Sonraki(_100);
        _100.Sonraki(_50);
        _50.Sonraki(_20);
        _20.Sonraki(_10);
        _10.Sonraki(_5);
        _5.Sonraki(_1);
        Miktar sonuc = new Miktar();
        List<Miktar> sonuclar = new ArrayList<>();
        do{
            sonuclar.add(sonuc=_200.ParaCek(tutar));
            tutar= sonuc.Kalan;
        }
        while (sonuc.Kalan>0);
        for (var s:sonuclar) {
            System.out.println("Tutar: " + s.Tutar + "\tAdet:"+s.Adet);

        }
    return  null;
    }
}
