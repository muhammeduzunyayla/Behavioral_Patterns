public class Para1 extends Banknot{
    @Override
    public Miktar ParaCek(int tutar) {
        if(tutar>=1){
            return new Miktar(tutar/1,tutar%1,1);
        }
        else {
            return _banknot.ParaCek(tutar);
        }
    }
}
