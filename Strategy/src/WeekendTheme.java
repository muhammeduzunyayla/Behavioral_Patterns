public class WeekendTheme implements ITheme{
    @Override
    public void temasecme() {
        System.out.println("Hafta Sonu indirimleri uygulandı");
    }

    @Override
    public void FiyatHesapla(int fiyat) {
        fiyat=fiyat-((fiyat*5)/100);
        System.out.println(fiyat);


    }
}
