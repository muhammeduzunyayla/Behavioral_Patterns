public class YilbasiTheme implements ITheme{
    @Override
    public void temasecme() {
        System.out.println("Yılbaşı İndirimleri uygulandı");
    }

    @Override
    public void FiyatHesapla(int fiyat) {
       fiyat=fiyat-((fiyat*20)/100);
        System.out.println(fiyat);

    }
}
