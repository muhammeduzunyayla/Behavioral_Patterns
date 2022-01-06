public class Para100 extends Banknot{
    @Override
public Miktar ParaCek(int tutar) {
    if(tutar>=100){
        return new Miktar(tutar/100,tutar%100,100);
    }
    else {
        return _banknot.ParaCek(tutar);
    }
}
}
