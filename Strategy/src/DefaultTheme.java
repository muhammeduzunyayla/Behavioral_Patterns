public class DefaultTheme implements ITheme{
    @Override
    public void temasecme() {
        System.out.println("Standart dönemdeyiz indirim yok");
    }

    @Override
    public void FiyatHesapla(int fiyat) {
        System.out.println(fiyat);

    }
}
