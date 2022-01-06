public class Context {
    ITheme iTheme;

    public Context(ITheme iTheme){
        this.iTheme=iTheme;

    }
    public void temaGetir(){
        iTheme.temasecme();
    }
    public void indirimgetir(int fiyat){
        iTheme.FiyatHesapla(fiyat);

    }

}
