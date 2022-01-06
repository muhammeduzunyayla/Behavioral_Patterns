public class Para10 extends Banknot{
    @Override
    public Miktar ParaCek(int tutar) {
        if(tutar>=10){
            return new Miktar(tutar/10,tutar%10,10);
        }
        else {
            return _banknot.ParaCek(tutar);
        }
    }
}
