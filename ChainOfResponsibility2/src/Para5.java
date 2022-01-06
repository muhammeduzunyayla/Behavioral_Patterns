public class Para5 extends Banknot{
    @Override
    public Miktar ParaCek(int tutar) {
        if(tutar>=5){
            return new Miktar(tutar/5,tutar%5,5);
        }
        else {
            return _banknot.ParaCek(tutar);
        }
    }
}
