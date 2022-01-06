public class Main {

    public static void main(String[] args) {
        Kullanici muhammed=new Kullanici("Muhammed Uzunyayla","mami@gmail.com");
        Kullanici batuhan=new Kullanici("Batuhan Altan","m.batuhan@gmail.com");

        Urun bilgisayar=new Urun("Bilgisayar ",100);

        System.out.println("1.Teklif");
        bilgisayar.TeklifVer(muhammed,50);
        System.out.println("2.Teklif");
        bilgisayar.TeklifVer(batuhan,100);
        System.out.println("3.Teklif");
        bilgisayar.TeklifVer(muhammed,150);
        System.out.println("4.Teklif");
        bilgisayar.TeklifVer(batuhan,200);

    }
}
