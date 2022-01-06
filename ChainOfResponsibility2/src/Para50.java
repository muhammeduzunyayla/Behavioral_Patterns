public class Para50 extends Banknot{
    @Override
    public Miktar ParaCek(int tutar) {
        if(tutar>=50){
            return new Miktar(tutar/50,tutar%50,50);
        }
        else {
            return _banknot.ParaCek(tutar);
        }
    }
}
