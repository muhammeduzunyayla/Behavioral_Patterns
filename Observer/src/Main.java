public class Main {

    public static void main(String[] args) {
         absUrun uruna=new UrunA("Telefon",123);
         absUrun urunb=new UrunA("Bilgisayar",56);
         PrimeKullanici kullanici=new PrimeKullanici("Maami",uruna);
         kullanici.favorilereEkle(uruna);
         kullanici.favorilereEkle(urunb);
         uruna.add(kullanici);
         urunb.add(kullanici);
         uruna.bildir();
         urunb.bildir();



    }
}
