public class Para20 extends Banknot{
    @Override
    public Miktar ParaCek(int tutar) {
        if(tutar>=20){
            return new Miktar(tutar/20,tutar%20,20);
        }
        else {
            return _banknot.ParaCek(tutar);
        }
    }
}
