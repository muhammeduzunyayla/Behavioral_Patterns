public class Para200 extends Banknot {
    @Override
    public Miktar ParaCek(int tutar) {
        if(tutar>=200){
            return new Miktar(tutar/200,tutar%200,200);
        }
      else {
          return _banknot.ParaCek(tutar);
        }
    }
}
