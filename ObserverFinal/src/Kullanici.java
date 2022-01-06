public class Kullanici implements IKatilimci{
    String isim;
    String mail;
    public Kullanici(String isim,String mail){
        this.isim=isim;
        this.mail=mail;
    }
    @Override
    public void mailHaberAl() {

    }
}
