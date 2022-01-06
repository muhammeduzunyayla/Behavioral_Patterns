import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	Musteri muhammed=new Musteri("Muhammed",123456,7200,1200,1);
        //önce yapılacak olan işlemlerin hepsi aynı listeye koyulur
        List<AbstractKrediIstegi>krediIstekleri=new ArrayList<>();
        //BÜTÜN işlemler listenin içerisine yerleştirilir
        krediIstekleri.add(new KbbSkorKontrolu());
        krediIstekleri.add(new KrediKartiOdemeZamaniKontrolu());
        krediIstekleri.add(new KefillerIyıMı());
        krediIstekleri.add(new MusteriMaasiKontrolu());

        krediIstekleri.get(0).setNext(krediIstekleri.get(1));
        krediIstekleri.get(1).setNext(krediIstekleri.get(2));
        krediIstekleri.get(2).setNext(krediIstekleri.get(3));

        krediIstekleri.get(0).Execute(muhammed);
        boolean krediOnaylandi=krediIstekleri.get(3).KrediOnaylandi;
        if(krediOnaylandi){
            System.out.println("Kredi isteği onaylandi");
        }
        else {
            System.out.println("Kredi istedği reddedildi");
        }



    }
}
